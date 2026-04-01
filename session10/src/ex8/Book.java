package ex8;

import java.util.Objects;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "mã sách: "+id+", tên sách: " +title+", tác giả: "+author+", năm phát hành: "+year;
    }

    // đảm bảo không trùng theo id
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o; // ép kiểu object thành Book
        return Objects.equals(this.id,book.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id);
    }
    // hashCode là hàm biến object thành số nguyên
}
