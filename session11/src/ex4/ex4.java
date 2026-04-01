package ex4;

import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManage pm = new ProductManage();

        int choice;
        while (true){
            System.out.println("\n*************** MENU QUẢN SẢN PHẨM ***************");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển th danh sách sản phẩm");
            System.out.println("5. Lọc sản phẩm theo giá");
            System.out.println("6. Tính tổng giá trị sản phẩm");
            System.out.println("7. Thoát");

            try {
                System.out.print("nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        int id = inputData.getInt(sc,"nhập id sản phẩm: ");
                        String name = inputData.getString(sc, "nhập tên sản phẩm: ");
                        double price = inputData.getDou(sc, "nhập giá sản phẩm: ");
                        pm.addProduct(new Product(id,name,price));
                        break;
                    case 2:
                        int editID = inputData.getInt(sc,"nhập id sản phẩm cần sửa: ");
                        if(pm.chkID(editID)){
                            String editName = inputData.getString(sc,"chỉnh sửa tên sản phẩm: ");
                            double editPrice = inputData.getDou(sc, "chinhr sửa giá sản phẩm: ");
                            pm.editProduct(new Product(editID,editName,editPrice));
                        } else System.out.println("sản phẩm không có trong danh sách");
                        break;
                    case 3:
                        int deleteID = inputData.getInt(sc,"nhập id saản phẩm cần xóa");
                        if(pm.chkID(deleteID)){
                            pm.deleteProduct(deleteID);
                        }else System.out.println("sản phẩm không có trong danh sách");
                        break;
                    case 4:
                        pm.display();
                        break;
                    case 5:
                        double filterPrice = inputData.getDou(sc,"nhập giá bắt đầu: ");
                        pm.priceFilter(filterPrice);
                        break;
                    case 6:
                        System.out.println("tổng giá trị sản phẩm: "+pm.getTotal());
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("vui lòng nhập số từ 1 - 7");
                }
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập số từ 1 - 7");
            }
        }
    }
}
