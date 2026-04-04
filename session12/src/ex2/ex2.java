package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AppointmentBusiness ApmB = new AppointmentBusiness();
        int choice;
        while (true){
            System.out.println("********************* QUẢN LÝ LỊCH HẸN ********************");
            System.out.println("1. Thêm lịch hẹn");
            System.out.println("2. Hiển thị danh sách lịch hẹn");
            System.out.println("3. Tìm kiếm lịch hẹn theo tên bệnh nhân");
            System.out.println("4. Cập nhật lịch hẹn theo mã lịch hẹn");
            System.out.println("5. Xóa lịch hẹn theo mã lịch hẹn");
            System.out.println("6. Thống kê");
            System.out.println("7. Thoát");

            choice = getInput.getInt(sc,"nhập lựa chọn của bạn: ");
            switch (choice){
                case 1:
                    ApmB.addAppointment(sc);
                    break;
                case 2:
                    ApmB.display();
                    break;
                case 3:
                    ApmB.paitentSearch(sc);
                    break;
                case 4:
                    ApmB.update(sc);
                    break;
                case 5:
                    ApmB.delete(sc);
                    break;
                case 6:
                    ApmB.statistic();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn từ 1-7");
            }
        }

    }
}
