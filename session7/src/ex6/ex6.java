package ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class ex6 {
    static ArrayList<Category> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args){
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm mới danh mục");
            System.out.println("2. Hiển thị danh sách danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục theo tên");
            System.out.println("6. Thoát");

            System.out.print("vui long chon tu 1 - 6: ");
            String input = sc.nextLine();

            choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.print("vui long chon tu 1 - 6: ");
            }

        } while (true);
    }

    // 1. Add
    public static void addCategory() {
        System.out.print("nhap id: ");
        String id = sc.nextLine();

        System.out.print("nhap ten: ");
        String name = sc.nextLine();

        System.out.print("nhap mo ta: ");
        String des = sc.nextLine();

        list.add(new Category(id, name, des));
    }

    // 2. Display
    public static void display() {
        if (list.isEmpty()) {
            System.out.println("danh sach trong");
            return;
        }

        for (Category c : list) {
            System.out.println(c);
        }
    }

    // 3. Update
    public static void update() {
        System.out.print("nhap id update: ");
        String id = sc.nextLine();

        for (Category c : list) {
            if (c.getId().equals(id)) {
                System.out.print("nhap ten moi: ");
                c.setName(sc.nextLine());

                System.out.print("nhap mo ta moi: ");
                c.setDescription(sc.nextLine());

                System.out.println("Updated!");
                return;
            }
        }

        System.out.println("khong tim thay id tuong ung");
    }

    // 4. Delete (fix lỗi remove)
    public static void delete() {
        System.out.print("nhap id can xoa: ");
        String id = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
                System.out.println("da xoa");
                return;
            }
        }

        System.out.println("khong tim thay id tuong ung");
    }

    // 5. Search
    public static void search() {
        System.out.print("nhap ten can tim kiem: ");
        String keyword = sc.nextLine().toLowerCase();

        for (Category c : list) {
            if (c.toString().toLowerCase().contains(keyword)) {
                System.out.println(c);
            }
        }
    }
}
