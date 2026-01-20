package a0120.ex04;

import java.util.ArrayList;

public class BookManager {

    public static void addBook(ArrayList<Book> list, String title, String author, int price) {
        list.add(new Book(title, author, price));
    }

    public static ArrayList<Book> findBooksByAuthor(ArrayList<Book> list, String author) {
        ArrayList<Book> result = new ArrayList<>();
        if (list == null || author == null) {
            return result; // 빈 리스트 반환
        }

        for (Book b : list) {
            if (b.author.equals(author)) {
                result.add(b);
            }
        }
        return result;
    }

    public static int getTotalPrice(ArrayList<Book> list) {
        int total = 0;
        if (list == null) {
            total = 0;
        }
        for (Book b : list) {
            total += b.price;
        }
        return total;
    }

    public static boolean removeBook(ArrayList<Book> list, String title) {
        if (list == null || title == null) {
            return false;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).title.equals(title)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

}
