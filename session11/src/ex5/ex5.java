package ex5;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventManage em = new EventManage();
        int choice;

        while (true){
            System.out.println("*** QUẢN LÝ SỰ KIỆN ***");
            System.out.println("1. thêm sự kiện");
            System.out.println("2. hiển thị danh sách sự kiện");
            System.out.println("3. thoát");
            System.out.print("nhập lựa chọn của bạn: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        em.addEvent(sc);
                        break;
                    case 2:
                        em.display();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("vui lòng chọn từ 1 - 3");
                }
            } catch (NumberFormatException e){
                System.out.println("vui lòng chọn từ 1 - 3");
            }
        }

    }
}
