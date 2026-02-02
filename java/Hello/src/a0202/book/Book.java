package a0202.book;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class Book {
    private static Book instance = new Book();
    private LinkedHashMap<Integer, BookInfo> bookList;
    private DecimalFormat df = new DecimalFormat("###,###원");

    private Book() {
        bookList = new LinkedHashMap<>();

        bookList.put(1, new BookInfo("자바의 정석", 1000));
        bookList.put(2, new BookInfo("이것이 자바다", 1200));
        bookList.put(3, new BookInfo("Do it! 자바 프로그래밍", 1000));
        bookList.put(4, new BookInfo("Head First Java", 1500));
        bookList.put(5, new BookInfo("Effective Java", 1800));
        bookList.put(6, new BookInfo("Clean Code", 1300));
    }

    public static Book getInstance() {
        return instance;
    }

    public Map<Integer, BookInfo> getBookList() {
        return bookList;
    }

    public void showMenu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("+------------------------도서목록----------------------+");
        System.out.println("|            Book                   price           |");

        for (Integer key : bookList.keySet()) {
            BookInfo b = bookList.get(key);

            System.out.printf(
                    ": [%d] %-20s %10s :\n",
                    key,
                    b.getName(),
                    df.format(b.getPrice()));
        }

        System.out.println("+----------------------------------------------------+");
        System.out.println("취소를 원하시면 0번을 눌러주세요");
    }

    public class BookInfo {
        private String name;
        private int price;

        public BookInfo(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }
}
