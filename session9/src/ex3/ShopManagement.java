package ex3;

import java.util.Arrays;
import java.util.Scanner;

public class ShopManagement {
    static Categories[] categories = new Categories[100];
    static Product[] products = new Product[100];
    static int catIndex = 0;
    static int proIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("********SHOP MENU********");
            System.out.println("1. Categories");
            System.out.println("2. Products");
            System.out.println("3. Exit");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    categoriesMenu(sc);
                    break;
                case 2:
                    productMenu(sc);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    // CATEGORY MENU
    static void categoriesMenu(Scanner sc) {
        while (true) {
            System.out.println("----CATEGORIES MENU----");
            System.out.println("1. Nhập");
            System.out.println("2. Hiển thị");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Đổi trạng thái");
            System.out.println("6. Thoát");

            int c = Integer.parseInt(sc.nextLine());

            switch (c) {
                case 1:
                    System.out.print("Số lượng: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        categories[catIndex] = new Categories();
                        categories[catIndex].inputData(sc, categories, catIndex);
                        catIndex++;
                    }
                    break;

                case 2:
                    for (int i = 0; i < catIndex; i++) {
                        categories[i].displayData();
                    }
                    break;

                case 3:
                    System.out.print("ID cần sửa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < catIndex; i++) {
                        if (categories[i].getCatalogId() == id) {
                            categories[i].inputData(sc, categories, i);
                        }
                    }
                    break;

                case 4:
                    System.out.print("ID xóa: ");
                    int del = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < catIndex; i++) {
                        if (categories[i].getCatalogId() == del) {
                            // check product
                            boolean hasProduct = false;
                            for (int j = 0; j < proIndex; j++) {
                                if (products[j].getCatalogId() == del) {
                                    hasProduct = true;
                                    break;
                                }
                            }
                            if (!hasProduct) {
                                for (int k = i; k < catIndex - 1; k++) {
                                    categories[k] = categories[k + 1];
                                }
                                catIndex--;
                            } else {
                                System.out.println("Không thể xóa!");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.print("ID: ");
                    int cid = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < catIndex; i++) {
                        if (categories[i].getCatalogId() == cid) {
                            categories[i].setCatalogStatus(!categories[i].isCatalogStatus());
                        }
                    }
                    break;

                case 6:
                    return;
            }
        }
    }

    // PRODUCT MENU
    static void productMenu(Scanner sc) {
        while (true) {
            System.out.println("----PRODUCT MENU----");
            System.out.println("1. Nhập");
            System.out.println("2. Hiển thị");
            System.out.println("3. Sort giá");
            System.out.println("4. Update");
            System.out.println("5. Xóa");
            System.out.println("6. Tìm tên");
            System.out.println("7. Tìm giá");
            System.out.println("8. Thoát");

            int c = Integer.parseInt(sc.nextLine());

            switch (c) {
                case 1:
                    products[proIndex] = new Product();
                    products[proIndex].inputData(sc, products, proIndex, categories, catIndex);
                    proIndex++;
                    break;

                case 2:
                    for (int i = 0; i < proIndex; i++) {
                        products[i].displayData();
                    }
                    break;

                case 3:
                    Arrays.sort(products, 0, proIndex, (a, b) -> Float.compare(a.getPrice(), b.getPrice()));
                    break;

                case 4:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    for (int i = 0; i < proIndex; i++) {
                        if (products[i].getProductId().equals(id)) {
                            products[i].inputData(sc, products, i, categories, catIndex);
                        }
                    }
                    break;

                case 5:
                    System.out.print("ID: ");
                    String del = sc.nextLine();
                    for (int i = 0; i < proIndex; i++) {
                        if (products[i].getProductId().equals(del)) {
                            for (int k = i; k < proIndex - 1; k++) {
                                products[k] = products[k + 1];
                            }
                            proIndex--;
                        }
                    }
                    break;

                case 6:
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < proIndex; i++) {
                        if (products[i].getProductName().contains(name)) {
                            products[i].displayData();
                        }
                    }
                    break;

                case 7:
                    System.out.print("a: ");
                    float a = Float.parseFloat(sc.nextLine());
                    System.out.print("b: ");
                    float b = Float.parseFloat(sc.nextLine());

                    for (int i = 0; i < proIndex; i++) {
                        if (products[i].getPrice() >= a && products[i].getPrice() <= b) {
                            products[i].displayData();
                        }
                    }
                    break;

                case 8:
                    return;
            }
        }
    }
}