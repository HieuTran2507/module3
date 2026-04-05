package ex6;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private final int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public String getDetail(){
        return "Tiêu đề: " + title + ", Tác giả: " + author + ", ISBN: " + isbn + ", Năm: " + year;
    }

    public String getISBN(){
        return isbn;
    }
}
