package a0205.jinair;

import java.util.Scanner;

public class FlightReservationMain {
    public static void main(String[] args) {
        FlightManager fm = new FlightManager();
        Scanner sc = new Scanner(System.in);
        // FileC fc = new FileC();
        System.out.println(fm.airplane);
        System.out.println("============== JavaAir 에 오신걸 환영합니다. ==============");

        Outter: while (true) {
            System.out.println("1. 항공편 목록\n2. 항공편 예매\n3. 예약 조회\n4. 티켓 저장\n5. 항공편 업로드 \n0.종료\n");
            System.out.print("메뉴 입력 > ");
            String menuStr = sc.next();
            sc.nextLine();
            int menu = -1;
            try {
                menu = Integer.parseInt(menuStr);
            } catch (Exception e) {
                menu = 9;
            }
            switch (menu) {
                case 1:
                    fm.displayFlightList(menuStr);
                    break;
                case 2:
                    try {
                        fm.bookFlight();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    fm.checkReservation();
                    break;
                default:
                    break;
            }
        }
    }
}
