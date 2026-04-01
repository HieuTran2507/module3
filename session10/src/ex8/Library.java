package ex8;

import java.util.*;

public class Library {

    private   Set<Book> books;
    public Library() {
        books = new HashSet<>();
    }

    // 1 thêm sách
    public void addBook(Book book){
        if(books.add(book)) {
            System.out.println("thêm sách thành công");
            System.out.println(book);
        }else {
            System.out.println("thêm sách không thành công");
        }

    }

    // 2 lọc sách theo năm và trả veef list
    public List<Book> filterByYear(int year){
        List<Book> result = new ArrayList<>();
        for(Book b : books){
            if (b.getYear() >= year) result.add(b);
        }
        if(result.isEmpty()) {
            System.out.println("không tìm thấy từ "+year+" trở đi");
        }
        else {
            System.out.println("đã tìm thấy từ "+year+" trở đi");
            for (Book b : result) System.out.println(b);
        }
        return result;
    }

    // sawsp xếp theo title
    public void sortByTitle(List<Book> books){
        Collections.sort(books, (a,b) -> a.getTitle().compareTo(b.getTitle()));
    }

    // in danh sach
    public void display(List<Book> li){
        for (Book b : li) System.out.println(b);
    }

}
