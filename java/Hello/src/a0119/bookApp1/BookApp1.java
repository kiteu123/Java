package a0119.bookApp1;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp1 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("자바의 정석", "남궁성"));
        list.add(new Book("혼자 공부하는 자바", "신용권"));
        list.add(new Book("이것이 자바다", "신용권"));

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("-------------");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 검색");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("선택 > ");

            int menu;
            try {
                menu = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("숫자만 입력하세요.");
                continue;
            }

            switch (menu) {
                case 1:
                    System.out.print("도서 제목 입력 : ");
                    String title = sc.nextLine();
                    System.out.print("도서 저자 입력 : ");
                    String author = sc.nextLine();
                    list.add(new Book(title, author));
                    System.out.println("도서 등록 완료");
                    break;
                case 2:
                    System.out.print("검색할 도서 제목 : ");
                    String searchTitle = sc.nextLine();
                    Book b = findBook(list, searchTitle);
                    if (b != null) {
                        System.out.println(b);
                    } else {
                        System.out.println("찾는 도서가 없습니다.");
                    }
                    break;
                case 3:
                    System.out.print("수정할 도서 제목 : ");
                    String fixTitle = sc.nextLine();
                    System.out.print("새 저자 입력 : ");
                    String fixAuthor = sc.nextLine();
                    if (fixBook(list, fixTitle, fixAuthor)) {
                        System.out.println("수정 완료");
                    } else {
                        System.out.println("해당 도서가 없습니다.");
                    }
                    break;
                case 4:
                    System.out.print("삭제할 도서 제목 : ");
                    String delTitle = sc.nextLine();
                    if (delBook(list, delTitle)) {
                        System.out.println("삭제 완료");
                    } else {
                        System.out.println("삭제할 도서가 없습니다.");
                    }
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("등록된 도서가 없습니다.");
                    } else {
                        for (Book book : list) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 6:
                    run = false;
                    sc.close();
                    break;
                default:
                    System.out.println("번호를 다시 입력하세요.");
            }
        }
    }

    private static boolean delBook(ArrayList<Book> list, String delTitle) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).title.equals(delTitle)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean fixBook(ArrayList<Book> list, String fixTitle, String fixAuthor) {
        for (Book b : list) {
            if (b.title.equals(fixTitle)) {
                b.author = fixAuthor;
                return true;
            }
        }
        return false;
    }

    private static Book findBook(ArrayList<Book> list, String searchTitle) {
        for (Book b : list) {
            if (b.title.equals(searchTitle)) {
                return b;
            }
        }
        return null;
    }
}
