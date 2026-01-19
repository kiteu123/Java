package a0119.bookApp1;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "제목 : " + title + ", 저자 : " + author;
    }
}
