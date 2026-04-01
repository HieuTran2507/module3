package ex5;

import java.util.Objects;
import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InvoiceManager manager = new InvoiceManager();

        int choice;
        while (true){
            System.out.println("\n*************** MENU QUẢN LÝ HÓA ĐƠN ***************");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Update hóa đơn");
            System.out.println("3. Xóa sinh hóa đơn");
            System.out.println("4. Hiển thị danh sách hóa đơn");
            System.out.println("5. Thoát");

            try {
                System.out.print("nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        String orderID = inputData.getString(sc, "nhập mã hóa đơn: ");
                        Double total = inputData.getDou(sc,"nhập số tiền: ");
                        manager.add(new Invoice(orderID,total));
                        break;
                    case 2:
                        String UpdateID = inputData.getString(sc,"nhập mã hóa đơn cần chỉnh sua: ");
                        int updateIndex = -1;
                        for(int i = 0; i<manager.Invoices.size(); i++){
                            if(manager.Invoices.get(i).getOrderID().equals(UpdateID)){
                                updateIndex = i;
                                break;
                            }
                        }
                        if(updateIndex == -1) System.out.println("không tìm thấy hóa đơn trong danh sách");
                        else {
                            double updateTotal = inputData.getDou(sc,"nhập số tiền chỉnh sửa: ");
                            Invoice updateInvoice = new Invoice(UpdateID, updateTotal);
                            manager.update(updateIndex,updateInvoice);
                        }
                        break;
                    case 3:
                        String deleteID = inputData.getString(sc,"nhập mã hóa đơn cần xóa: ");
                        int deleteIndex = -1;
                        for(int i = 0; i<manager.Invoices.size(); i++){
                            if(manager.Invoices.get(i).getOrderID().equals(deleteID)){
                                deleteIndex = i;
                                break;
                            }
                        }
                        if(deleteIndex == -1) System.out.println("không tìm thấy hóa đơn trong danh sách");
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
