package a0128.library;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private List<Book> bookList = new ArrayList<>();
    private final String filename = "c:/Users/TJ/memo/book.txt";

    private void ensureDirectory() {
        File file = new File(filename);
        File dir = file.getParentFile();
        if (dir != null && !dir.exists()) {
            dir.mkdirs();
            System.out.println("디렉토리가 생성되었습니다: " + dir.getPath());
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Scanner sc) {
        System.out.print("책 제목: ");
        String title = sc.nextLine();
        System.out.print("저자: ");
        String author = sc.nextLine();
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();

        double price;
        while (true) {
            try {
                System.out.print("가격: ");
                price = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("가격은 숫자만 입력하세요.");
            }
        }

        int id = bookList.size();
        bookList.add(new Book(id, title, author, isbn, price));
        System.out.println("도서가 추가되었습니다.");
    }

    public void deleteBook(Scanner sc) {
        System.out.print("책 이름을 입력 >> ");
        String title = sc.nextLine();
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("찾는 도서가 없습니다.");
            return;
        }

        bookList.remove(book);
        System.out.println(title + "를 제거 하였습니다.");
    }

    public void searchBook(Scanner sc) {
        System.out.print("책 이름을 입력 >> ");
        String title = sc.nextLine();
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("찾는 도서가 없습니다.");
        } else {
            System.out.println(book);
        }
    }

    public void updateBook(Scanner sc) {
        System.out.print("책 이름을 입력 >> ");
        String title = sc.nextLine();
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("찾는 도서가 없습니다.");
            return;
        }

        System.out.print("새 제목: ");
        book.setTitle(sc.nextLine());
        System.out.print("저자: ");
        book.setAuthor(sc.nextLine());
        System.out.print("ISBN: ");
        book.setIsbn(sc.nextLine());

        while (true) {
            try {
                System.out.print("가격: ");
                book.setPrice(Double.parseDouble(sc.nextLine()));
                break;
            } catch (Exception e) {
                System.out.println("가격은 숫자만 입력하세요.");
            }
        }

        System.out.println("도서 정보가 수정되었습니다.");
    }

    public void printAll() {
        if (bookList.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public void saveToFile() {
        ensureDirectory();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Book book : bookList) {
                bw.write(book.toFilestring());
                bw.newLine();
            }
            System.out.println("파일 저장 완료: " + filename);
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생");
        }
    }

    public void loadFromFile() {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("파일이 없습니다. 새로 시작합니다.");
            return;
        }

        bookList.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                bookList.add(Book.fromFileString(line));
            }
            System.out.println("파일 불러오기 완료! (" + bookList.size() + "권)");
        } catch (IOException e) {
            System.out.println("파일 불러오기 오류");
        }
    }
}
