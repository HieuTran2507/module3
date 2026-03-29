package ex3;

import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager manager = new UserManager();
        int choice;

        while (true){
            System.out.println("\n*************** MENU QUẢN LÝ SÁCH ***************");
            System.out.println("1. nhập thông tin người dùng");
            System.out.println("2. xóa người dùng theo email");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");

            try{
                System.out.print("nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        String name = inputData.getString(sc, "nhập tên người dùng: ");
                        String email = inputData.getString(sc, "nhập email người dùng: ");
                        String phone = inputData.getString(sc, "nhập số điện thoại người dùng");
                        User u = new User(name, email, phone);
                        manager.addUser(u);
                        break;
                    case 2:
                        System.out.print("nhập email người dùng cần xóa: ");
                        String deleteEmail = sc.nextLine();
                        boolean deletChk = manager.removeUser(deleteEmail);
                        if(deletChk) System.out.println("đã xóa thành công");
                        else System.out.println("xóa không thành công");
                        break;
                    case 3:
                        System.out.println("danh sachs người dùng: ");
                        manager.displayUsers();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("\nvui lòng nhập số từ 1 - 4");
                }
            }catch (NumberFormatException e){
                System.out.println("\nvui lòng nhập số từ 1 - 4");
            }
        }
    }
}
