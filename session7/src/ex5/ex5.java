package ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> listProduct = new ArrayList<>();
    public static void main(String[] args){
        int choice;

        do{
            System.out.println("-------------MENU-------------");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("chon tu 1 - 5: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addProducts();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    capNhat();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.print("chon tu 1 - 5: ");
            }
        }
        while (true);
    }

    // them moi san pham
    public static void addProducts(){
        System.out.print("nhap id san pham: ");
        String id = sc.nextLine();
        // kiem tra trung id
        if (timTheoId(id) != null) {
            System.out.println("ID đã tồn tại!");
            return;
        }
        System.out.print("nhap ten san pham: ");
        String productName = sc.nextLine();
        System.out.print("nhap gia san pham: ");
        double price = Double.parseDouble(sc.nextLine());

        listProduct.add(new Product(id,productName,price));
    }

    // tim theo id
    public static Product timTheoId(String id) {
        for (Product p : listProduct) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // hien thi
    public static void hienThi() {
        if (listProduct.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        for (Product p : listProduct) {
            System.out.println(
                    "ID: " + p.getId() + " | Name: " + p.getName() + " | Price: " + p.getPrice()
            );
        }
    }

    // cap nhat
    public static void capNhat() {
        System.out.print("Nhập id cần cập nhật: ");
        String id = sc.nextLine();

        Product p = timTheoId(id);

        if (p == null) {
            System.out.println("Không tìm thấy!");
            return;
        }

        System.out.print("Nhập tên mới: ");
        p.setName(sc.nextLine());

        System.out.print("Nhập giá mới: ");
        p.setPrice(Double.parseDouble(sc.nextLine()));

        System.out.println("Cập nhật thành công!");
    }

    // xoa
    public static void xoa() {
        System.out.print("Nhập id cần xóa: ");
        String id = sc.nextLine();

        Product p = timTheoId(id);

        if (p == null) {
            System.out.println("Không tìm thấy!");
            return;
        }

        listProduct.remove(p);
        System.out.println("Xóa thành công!");
    }
}
