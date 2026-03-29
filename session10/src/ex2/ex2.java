package ex2;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();
        int choice;

        while (true){
            System.out.println("\n*************** MENU QUẢN LÝ SÁCH ***************");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Thoát");

            try {
                System.out.print("nhập lựa chojn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        String bookName = inputData.getString(sc, "nhập tên sách: ");
                        String author = inputData.getString(sc, "nhập tên tác giả: ");
                        Integer publishYear = inputData.getInt(sc, "nhập năm xuất bản: ");
                        Book book = new Book(bookName, author, publishYear);
                        manager.addBook(book);
                        break;
                    case 2:
                        System.out.println("nhập tên sách cần tìm: ");
                        String name = sc.nextLine();
                        try {
                            Book foundBook = manager.findBook(name);
                            System.out.println("đã tìm thấy: "+foundBook);
                        }catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("danh sách sách: ");
                        manager.display();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("vui long nhap so tu 1 - 4");
                }

            } catch (NumberFormatException e){
                System.out.println("\nvui long nhap so tu 1 - 4");
            }
        }
    }
}
