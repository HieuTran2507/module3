package ex6;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements IBookManager{
    private List<Book> books;

    public BookManager(){
        books = new ArrayList<>();
    }

    //ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("da them sach: "+book.getDetail());
    }

    @Override
    public void removeBook(String isbn) {
        boolean removed = books.removeIf(b ->b.getISBN().equals(isbn)); // neu true thi xoa
        if (removed) {
            System.out.println("Đã xóa sách có ISBN: " + isbn);
        } else {
            System.out.println("Không tìm thấy sách có ISBN: " + isbn);
        }
    }

    @Override
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        for (Book b : books) {
            System.out.println(b.getDetail());
        }
    }
}
