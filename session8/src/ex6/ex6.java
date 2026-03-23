package ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("---MENU---");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Thoát");
            System.out.print("vui long chon tu 1 - 4: ");
            choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    System.out.print("Nhập tiêu đề: ");
                    String title = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = scanner.nextLine();
                    System.out.print("Nhập ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    Book newbooks = new Book(title, author, isbn, year);
                    manager.addBook(newbooks);
                    break;
                case 2:
                    manager.displayBooks();
                    break;
                case 3:
                    System.out.print("Nhập ISBN sách cần xóa: ");
                    String isbnToRemove = scanner.nextLine();
                    manager.removeBook(isbnToRemove);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (true);
    }
}
