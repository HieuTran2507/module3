package ex6;

import java.util.Scanner;

public class ex6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager manager = new OrderManager();

        int choice;
        while (true){
            System.out.println("\n*************** MENU QUẢN ĐƠN HÀNG ***************");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh sách đơn hàng");
            System.out.println("5. Thoát");

            try {
                System.out.print("nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        String orderId = inputData.getString(sc,"nhập mã đơn hàng: ");
                        String customerName = inputData.getString(sc,"nhập tên khách hàng: ");
                        manager.add(new Order(orderId,customerName));
                        break;
                    case 2:
                        String updateOrderID = inputData.getString(sc, "nhập mã đơn hàng cần sửa: ");
                        int updateIndex = -1;
                        for(int i=0; i<manager.orders.size(); i++){
                            if(manager.orders.get(i).getOrderID().equals(updateOrderID)){
                                updateIndex = i;
                                break;
                            }
                        }
                        if (updateIndex == -1) System.out.println("không có đơn hàng trong danh sách");
                        else {
                            String updateCustomerName = inputData.getString(sc,"Sửa tên khách hàng: ");
                            manager.update(updateIndex, new Order(updateOrderID,updateCustomerName));
                        }
                        break;
                    case 3:
                        String deleteOrderID = inputData.getString(sc, "nhập mã đơn hàng cần xóa: ");
                        int deleteIndex = -1;
                        for(int i=0; i<manager.orders.size(); i++){
                            if(manager.orders.get(i).getOrderID().equals(deleteOrderID)){
                                deleteIndex = i;
                                break;
                            }
                        }
                        if (deleteIndex == -1) System.out.println("không có đơn hàng trong danh sách");
                        else {
                            manager.delete(deleteIndex);
                        }
                        break;
                    case 4:
                        manager.display();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("vui lòng nhập số từ 1 - 5");
                }
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập số từ 1 - 5");
            }
        }
    }
}
