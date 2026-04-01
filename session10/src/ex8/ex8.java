package ex8;

import java.util.ArrayList;
import java.util.List;

public class ex8 {
    static void main(String[] args) {
        // 1 lưu sasch không trùng id
        Book b1 = new Book("bk1","sách 1", "nguyen van a",2020);
        Book b2 = new Book("bk2","sách 5", "nguyen van b",2021);
        Book b3 = new Book("bk2","sách 3", "nguyen van c",2022);// sách trùng
        Book b4 = new Book("bk4","sách 4", "nguyen van d",2023);
        Book b5 = new Book("bk5","sách 6", "nguyen van e",2023);
        Book b6 = new Book("bk6","sách 2", "nguyen van f",2025);

        Library libraryManager = new Library();
        libraryManager.addBook(b1);
        libraryManager.addBook(b2);
        libraryManager.addBook(b3);
        libraryManager.addBook(b4);
        libraryManager.addBook(b5);
        libraryManager.addBook(b6);

        // 2 lojc sách theo năm
        var li1 = libraryManager.filterByYear(2023);
        var li2 = libraryManager.filterByYear(2050); // không tìm được

        // 3 sắp xếp theo tiêu đề
        libraryManager.sortByTitle(li1);

        // hieenr thị
        libraryManager.display(li1);

    }
}
