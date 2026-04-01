package ex3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        MessageManage mm = new MessageManage();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("\n*************** MENU QUẢN LÝ TIN NHẮN ***************");
            System.out.println("1. gửi tin nhắn");
            System.out.println("2. xem tin nhắn");
            System.out.println("3. lọc theo người gửi");
            System.out.println("4. lọc theo ngày");
            System.out.println("5. Thoát");

            try {
                System.out.print("nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        String sender = inputData.getString(sc, "nhập tên người gửi: ");
                        String content = inputData.getString(sc, "nhập nội dung tin nhắn: ");
                        LocalDateTime timestamp = LocalDateTime.now();
                        mm.sendMessage(new Message(sender,content,timestamp));
                        break;
                    case 2:
                        mm.showMessage();
                        break;
                    case 3:
                        String filterSender = inputData.getString(sc, "nhập tên người gửi cần lọc: ");
                        mm.senderFilter(filterSender);
                        break;
                    case 4:
                        LocalDate date = inputData.getLocalDate(sc,"nhập ngày cần lọc yyyy-mm-dd: ");
                        mm.dateFilter(date);
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
