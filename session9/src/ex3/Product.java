package ex3;

import java.util.Scanner;

public class Product implements IShop {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private int catalogId;
    private int productStatus;

    public Product() {}

    public Product(String productId, String productName, float price, String description, int catalogId, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    // input
    public void inputData(Scanner sc, Product[] arr, int index, Categories[] cats, int catIndex) {

        // ID
        while (true) {
            System.out.print("Mã (C/S/A + 3 ký tự): ");
            String id = sc.nextLine();
            if (id.matches("[CSA]\\w{3}") && !isExistId(id, arr, index)) {
                this.productId = id;
                break;
            }
            System.out.println("ID lỗi!");
        }

        // name
        while (true) {
            System.out.print("Tên (10-50): ");
            String name = sc.nextLine();
            if (name.length() >= 10 && name.length() <= 50 && !isExistName(name, arr, index)) {
                this.productName = name;
                break;
            }
        }

        // price
        while (true) {
            System.out.print("Giá: ");
            float p = Float.parseFloat(sc.nextLine());
            if (p > 0) {
                this.price = p;
                break;
            }
        }

        System.out.println("Chọn danh mục:");
        for (int i = 0; i < catIndex; i++) {
            cats[i].displayData();
        }

        System.out.print("Nhập catalogId: ");
        this.catalogId = Integer.parseInt(sc.nextLine());

        System.out.print("Mô tả: ");
        this.description = sc.nextLine();

        System.out.print("Trạng thái (0-2): ");
        this.productStatus = Integer.parseInt(sc.nextLine());
    }

    private boolean isExistId(String id, Product[] arr, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i].productId.equals(id)) return true;
        }
        return false;
    }

    private boolean isExistName(String name, Product[] arr, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i].productName.equalsIgnoreCase(name)) return true;
        }
        return false;
    }

    @Override
    public void displayData() {
        System.out.printf("ID:%s | Name:%s | Price:%.1f | Catalog:%d | Status:%d\n",
                productId, productName, price, catalogId, productStatus);
    }
}
