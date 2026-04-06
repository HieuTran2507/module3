package ex1_4;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentBusiness manager = new StudentBusiness();

        while (true) {
            System.out.println("\n*************** MENU QUẢN LÝ SINH VIÊN ***************");
            System.out.println("1. Hiển thị danh sách sinh viên.");
            System.out.println("2. Thêm mới sinh viên.");
            System.out.println("3. Sửa sinh viên.");
            System.out.println("4. Xóa sinh viên.");
            System.out.println("5. Tìm kiếm sinh viên.");
            System.out.println("6. Thoát.");

            Integer choice = inputSuggest.getInt(sc,"nhập lựa chọn của bạn: ");
            switch (choice){
                case 1:
                    manager.getAllStudents();
                    break;
                case 2:
                    manager.addStudent(sc);
                    break;
                case 3:
                    manager.updateStudent(sc);
                    break;
                case 4:
                    manager.deleteStudent(sc);
                    break;
                case 5:
                    Integer id = inputSuggest.getInt(sc,"nhaajp id sinh viên cần tìm: ");
                    manager.findID(id);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn từ 1 - 6");
            }
        }
    }
}
