package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class ex8 {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args){
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên dựa vào mã sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");

            System.out.print("vui long chon tu 1 - 5: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.print("vui long chon tu 1 - 5: ");
            }

        } while (true);
    }

    // Display
    public static void display() {
        if (list.isEmpty()) {
            System.out.println("danh sach trong");
            return;
        }

        for (Student s : list) {
            s.displayData();
        }
    }

    // Add
    public static void add() {
        Student s = new Student();
        s.inputData(sc);
        list.add(s);
    }

    // Update
    public static void update() {
        System.out.print("nhap id cap nhat: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Student s : list) {
            if (s.getId() == id) {

                System.out.print("ten moi: ");
                s.setName(sc.nextLine());

                System.out.print("tuoi moi: ");
                s.setAge(Integer.parseInt(sc.nextLine()));

                System.out.print("gioi tinh moi (MALE/FEMALE/OTHER): ");
                s.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

                System.out.print("dia chi moi: ");
                s.setAddress(sc.nextLine());

                System.out.print("sdt moi: ");
                s.setPhoneNumber(sc.nextLine());

                System.out.println("da cap nhat thanh cong");
                return;
            }
        }

        System.out.println("khong tim thay id tuong ung");
    }

    // Delete
    public static void delete() {
        System.out.print("nhap id can xoa: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                System.out.println("da xoa");
                return;
            }
        }

        System.out.println("khong tim thay id tuong ung");
    }
}
