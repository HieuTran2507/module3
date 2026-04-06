package ex1_4;

import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductBusiness PM = new ProductBusiness();
        int choice;

        while (true){
            System.out.println("*** QUẢN LÝ SẢN PHẨM ***");
            System.out.println("1. Nhập sản phẩm");
            System.out.println("2. Danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm theo mã sản phẩm");
            System.out.println("4. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo số lượng giảm dần");
            System.out.println("8. Thoát");

            choice = input_suggest.getInt(sc,"nhập lựa chọn của bạn: ");
            switch (choice){
                case 1:
                    PM.addProduct(sc);
                    break;
                case 2:
                    PM.display();
                    break;
                case 3:
                    PM.updateProduct(sc);
                    break;
                case 4:
                    PM.deleteProduct(sc);
                    break;
                case 5:
                    PM.search(sc);
                    break;
                case 6:
                    PM.filterPriceASC();
                    break;
                case 7:
                    PM.filterQuantityDesc();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 1 - 8: ");
            }
        }


    }
}
