package a0128.library;

public class Book {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private double price;

    public Book(int id, String title, String author, String isbn, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toFilestring() {
        return id + "|" + title + "|" + author + "|" + isbn + "|" + price;
    }

    public static Book fromFileString(String line) {
        String[] data = line.split("\\|");
        return new Book(Integer.parseInt(data[0]), data[1], data[2], data[3], Double.parseDouble(data[4]));
    }

    @Override
    public String toString() {
        return "[제목: " + title + ", 저자: " + author + ", ISBN: " + isbn + ", 가격: " + price + "]";
    }

}
