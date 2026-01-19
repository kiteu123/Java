package a0119.bookApp;

import java.util.ArrayList;

public class BookApp {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("자바의 정석", "남궁성"));
        list.add(new Book("혼자 공부하는 자바", "신용권"));
        list.add(new Book("이것이 자바다", "신용권"));

        printAll(list);

        System.out.println("=== 수정 ===");
        updateBook(list, "자바의 정석", "남궁성(개정판)");
        printAll(list);

        System.out.println("=== 삭제 ===");
        deleteBook(list, "혼자 공부하는 자바");
        printAll(list);

        System.out.println("=== 검색 ===");
        Book b = findBook(list, "이것이 자바다");
        System.out.println(b);
    }

    private static Book findBook(ArrayList<Book> list, String string) {
        for (Book l : list) {
            if (l.title.equals(string)) {
                return l;
            }
        }
        return null;
    }

    private static boolean deleteBook(ArrayList<Book> list, String string) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).title.equals(string)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean updateBook(ArrayList<Book> list, String string, String string2) {
        for (Book l : list) {
            if (l.title.equals(string)) {
                l.author = string2;
                return true;
            }
        }
        return false;
    }

    private static void printAll(ArrayList<Book> list) {
        for (Book l : list) {
            System.out.println(l);
        }
    }
}
