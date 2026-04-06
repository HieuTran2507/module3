package ex9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("===== CONTACT MENU =====");
            System.out.println("1. Thêm");
            System.out.println("2. Xóa");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Hiển thị");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    manager.addContact(new Contact(name, phone));
                    break;

                case 2:
                    System.out.print("Phone cần xóa: ");
                    manager.removeContact(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Phone cần tìm: ");
                    manager.searchContact(sc.nextLine());
                    break;

                case 4:
                    manager.displayAll();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
