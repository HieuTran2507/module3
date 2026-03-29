package ex2;

public class Book {
    private String bookName;
    private String author;
    private Integer publicYear;

    public Book(String bookName, String author, Integer publicYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(Integer publicYear) {
        this.publicYear = publicYear;
    }

    @Override
    public String toString(){
        return "tên sách: " + bookName + ", tác giả: " + author + ", năm xuất bản: " + publicYear;
    }
}
