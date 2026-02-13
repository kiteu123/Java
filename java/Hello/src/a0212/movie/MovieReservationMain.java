package a0212.movie;

import java.util.Scanner;

public class MovieReservationMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReservationManager manager = new ReservationManager();

        // 기본 영화 등록
        manager.addMovie(new Movie("Inception", "18:00", 12000, 50));
        manager.addMovie(new Movie("Interstellar", "20:30", 15000, 50));

        while (true) {

            System.out.println("\n=== 영화 예매 시스템 ===");
            System.out.println("1. 사용자 메뉴");
            System.out.println("2. 관리자 메뉴");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            String choice = sc.nextLine();

            switch (choice) {

                case "1":
                    userMenu(manager, sc);
                    break;

                case "2":
                    adminMenu(manager, sc);
                    break;

                case "0":
                    System.out.println("시스템 종료");
                    return;

                default:
                    System.out.println("잘못된 선택");
            }
        }
    }

    // 사용자 메뉴
    private static void userMenu(ReservationManager manager, Scanner sc) {

        while (true) {

            System.out.println("\n=== 사용자 메뉴 ===");
            System.out.println("1. 영화 목록");
            System.out.println("2. 예매");
            System.out.println("3. 예약 조회");
            System.out.println("4. 예약 취소");
            System.out.println("5. 전체 취소");
            System.out.println("6. 티켓 출력");
            System.out.println("0. 뒤로가기");
            System.out.print("선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    manager.showMovies();
                    break;

                case 2:
                    manager.showMovies();
                    manager.movieReservation();
                    break;

                case 3:
                    manager.checkReservation();
                    break;

                case 4:
                    manager.cancelReservation();
                    break;

                case 5:
                    manager.cancelAllReservation();
                    break;

                case 6:
                    manager.printTicket();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("잘못된 선택");
            }
        }
    }

    // 관리자 메뉴
    private static void adminMenu(ReservationManager manager, Scanner sc) {

        System.out.print("관리자 비밀번호(1234): ");
        String pw = sc.nextLine();

        if (!pw.equals("1234")) {
            System.out.println("비밀번호 오류");
            return;
        }

        while (true) {

            System.out.println("\n=== 관리자 메뉴 ===");
            System.out.println("1. 영화 추가");
            System.out.println("0. 뒤로가기");
            System.out.print("선택: ");

            int sel = sc.nextInt();
            sc.nextLine();

            if (sel == 1) {

                System.out.print("제목: ");
                String title = sc.nextLine();

                System.out.print("시간: ");
                String time = sc.nextLine();

                System.out.print("가격: ");
                int price = sc.nextInt();

                System.out.print("좌석수: ");
                int seat = sc.nextInt();
                sc.nextLine();

                manager.addMovie(new Movie(title, time, price, seat));

                System.out.println("영화 추가 완료");

            } else if (sel == 0) {
                return;
            }
        }
    }
}
