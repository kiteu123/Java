package a0202.book;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BookService {
    private Scanner sc = new Scanner(System.in);

    private Book book = Book.getInstance();
    private Member member = new Member(1);

    private DecimalFormat df = new DecimalFormat("###,###원");

    public void start() {
        System.out.println("어서오세요. 더조은 도서관입니다.\n");

        rent();
        showResult();
        pay();
        finish();
    }

    private void finish() {

        System.out.println("\n기다려 주시면 대여하신 도서를 준비하겠습니다.");

        System.out.println("\n+----------------------------------------------------+");
        System.out.println(" | 회원 " + member.getMemberNo() + " 회원님 대여하신 도서 준비되었습니다 |");

        for (Integer key : member.getRentList().keySet()) {

            int day = member.getRentList().get(key);
            String name = book.getBookList().get(key).getName();

            System.out.printf(
                    " | [%d] %-15s : %3d일 |\n",
                    key,
                    name,
                    day);
        }

        System.out.println("+----------------------------------------------------+");
    }

    private void pay() {
        int total = calcTotal();

        if (member.getMoney() < total) {
            System.out.println("잔액이 부족하니다.");
            return;
        }

        System.out.println("\n결제를 도와 드리겠습니다. 카드를 넣어주세요.");
        try {
            System.out.print("결제중입니다.");
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
        } catch (Exception e) {
        }
        member.minusMoney(total);

        System.out.println("\n결제가 완료 되었습니다.");
        System.out.println("이용해주셔서 감사합니다.");
    }

    private int calcTotal() {
        int total = 0;
        for (Integer key : member.getRentList().keySet()) {
            int day = member.getRentList().get(key);
            int price = book.getBookList().get(key).getPrice();

            total += day * price;
        }

        return total;
    }

    private void showResult() {
        System.out.println("\n+----------------------------------------------------+");
        System.out.println(" | 회원 " + member.getMemberNo() + "번 회원님 의 대여 내역 입니다 |");

        int total = 0;

        for (Integer key : member.getRentList().keySet()) {
            int day = member.getRentList().get(key);

            Book.BookInfo info = book.getBookList().get(key);

            int price = day * info.getPrice();

            total += price;

            System.out.printf(
                    " | [%d] %-15s : %3d일 %8s |\n",
                    key,
                    info.getName(),
                    day,
                    df.format(price));
        }
        System.out.println("+----------------------------------------------------+");
        System.out.println("=========== 총 결제 금액은 " + df.format(total) + "입니다 ==========");
    }

    private void rent() {
        while (true) {
            book.showMenu();
            System.out.print("원하는 도서의 번호를 선택해주세요: ");
            int num = sc.nextInt();

            if (num == 0)
                break;
            if (!book.getBookList().containsKey(num)) {
                System.out.println("잘못된 번호입니다.");
                continue;
            }

            Book.BookInfo info = book.getBookList().get(num);

            System.out.print("선택 하신 도서는: " + info.getName() + "입니다. 며칠 대여하시겠습니까?");
            int day = sc.nextInt();

            member.addRent(num, day);

            System.out.println("\n대여를 계속 하시겠습니까?");
            System.out.print("예(Y)/아니오(N): ");
            String yesOrno = sc.next();
            if (yesOrno.equalsIgnoreCase("n"))
                break;
        }
    }
}
