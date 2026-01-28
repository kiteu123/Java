package a0128.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();

        while (true) {
            System.out.println("==== 도서 관리 시스템 ====");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 수정");
            System.out.println("5. 도서 목록 보기");
            System.out.println("6. 파일로 저장");
            System.out.println("7. 파일에서 불러오기");
            System.out.println("0. 종료");
            System.out.print(">> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1 -> manager.addBook(sc);
                case 2 -> manager.deleteBook(sc);
                case 3 -> manager.searchBook(sc);
                case 4 -> manager.updateBook(sc);
                case 5 -> manager.printAll();
                case 6 -> manager.saveToFile();
                case 7 -> manager.loadFromFile();
                case 0 -> {
                    System.out.println("종료합니다.");
                    return;
                }

                default -> System.out.println("잘못된 선택입니다.");

            }
        }
    }
}
