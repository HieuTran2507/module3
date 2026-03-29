package ex2;

import java.util.HashMap;

public class BookManager {
    private HashMap<String, Book> books;

    public BookManager() {
        books = new HashMap<>();
    }

    public void addBook(Book book){
        books.put(book.getBookName(),book);
        // key là tên sách
        // value gồm: tên sách, tác giả, năm xuất bản
    }

    public Book findBook(String title) throws Exception{
        if(!books.containsKey(title)) throw new Exception("sách không tồn tại");
        return books.get(title);
    }
    public void display(){
        if(books.isEmpty()) System.out.println("chưa có sách nào trong danh sách");
        else {
            for (Book b : books.values()) System.out.println(b);
        }
    }
}
