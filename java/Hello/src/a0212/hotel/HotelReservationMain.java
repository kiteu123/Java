package a0212.hotel;

import java.util.Scanner;

public class HotelReservationMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ReservationManager manager = new ReservationManager();
        ReservationTicket ticket = new ReservationTicket(manager);
        ticket.updateHotelList();

        while (true) {

            System.out.println("\n=== 호텔 예약 시스템 ===");
            System.out.println("1. 호텔 목록");
            System.out.println("2. 호텔 예약");
            System.out.println("3. 예약 조회");
            System.out.println("4. 예약 취소");
            System.out.println("5. 전체 취소");
            System.out.println("6. 티켓 출력");
            System.out.println("7. 할인 설정");
            System.out.println("0. 종료");

            System.out.print("선택: ");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {

                case 1:
                    manager.showHotels();
                    break;

                case 2:
                    manager.hotelReservation();
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

                case 7:
                    manager.setDiscountRate(sc);
                    break;

                case 0:
                    System.out.println("종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 선택");
            }
        }
    }
}
