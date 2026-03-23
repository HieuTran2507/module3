package ex6;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

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
