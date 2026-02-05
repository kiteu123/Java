package a0205.jinair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class FlightManager {
    private static ArrayList<Flight> flights;
    private static ArrayList<Passenger> passengers;

    private static Map<String, Flight> reservationMap = new HashMap<>();

    // private static FileC fc = new FileC();
    Scanner sc = new Scanner(System.in);

    public FlightManager() {
        flights = new ArrayList<>();
        flights.add(new Flight("Jeju", "11:55", 78000, false));
        flights.add(new Flight("Istanbul", "17:10", 1200000, true));
        flights.add(new Flight("Bangkok", "21:35", 280000, true));

        passengers = new ArrayList<>();
        reservationMap = new HashMap<>();

        Flight sf = flights.get(0);
        reservationMap.put("테스트", sf);
    }

    public String airplane = "                       |                      \n"
            + "                      _|_                     \n" + "                    /_____\\                  \n"
            + "                   /oo   oo\\                 \n" + " \\_________________\\       /_________________/\n"
            + "  `-------|---|-----\\_____/-----|---|-------'\n" + "         ( ) ( )  O|OOo|oOO|O  ( ) ( )   \n";

    public void displayFlightList(String str) {
        // 항공편 목록이 출력 -> flight 에서 toString 이용해서
        System.out.println("=========================== " + str + " =========================");
        int count = 1;
        for (Flight flight : flights) {
            System.out.println(count + ". " + flight);
            count++;
        }
        System.out.println("============================================================");

    }

    public void bookFlight() throws InterruptedException {
        for (;;) {
            displayFlightList("항공편 예매");
            System.out.print("예매할 항공편 입력 > ");
            try {
                int bookNum = Integer.parseInt(sc.next());
                if (bookNum > flights.size() || bookNum < 1) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
                System.out.println("선택한 항공편");
                System.out.println("============================================================");
                System.out.println(bookNum + "" + flights.get(bookNum - 1));
                System.out.println("============================================================");
                Flight sf = flights.get(bookNum - 1);
                if (flights.get(bookNum - 1).getInternationalFlight()) {
                    System.out.println("국제선은 만 15세 이상 예매가능");
                    passengersInfo(sf);
                } else {
                    passengersInfo(sf);
                }
                if (passengers != null && !passengers.isEmpty()) {
                    String seatNum = Integer.toString(seatSelection(sf));
                    passengers.get(passengers.size() - 1).setSeat(seatNum);
                    // Passenger("이철수", 880720, "9999", null)
                    System.out.println("예약중입니다.");
                    Thread.sleep(2000);
                    System.out.println("예약에 성공했습니다.");
                    reservationMap.put(passengers.get(passengers.size() - 1).getName(), sf);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private int seatSelection(Flight flight) {
        int seatNum = -1;
        while (true) {
            try {
                System.out.println("================================================");
                flight.seatToString();
                System.out.print("선택 > ");
                int seatInt = sc.nextInt() - 1;
                sc.nextLine();
                if (seatInt + 1 < 1 || seatInt + 1 > 20) {
                    System.out.println("존재하지 않는 좌석입니다.");
                } else if (flight.getSeats().get(seatInt).equals("XX")) {
                    System.out.println("이미 예약된 좌석입니다.");
                } else {
                    flight.getSeats().set(seatInt, "XX");
                    System.out.println("좌석 선택이 완료되었습니다.");
                    seatNum = seatInt;
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
                sc.nextLine();
            }
        }
        return seatNum;
    }

    private void passengersInfo(Flight flight) {
        System.out.println("예매자 정보를 입력하세요.");
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.printf("생년월일(6자리):");
        try {
            int birthDate = Integer.parseInt(sc.next());
            Passenger p = new Passenger(name, birthDate);
            if (!p.man15(p) && flight.getInternationalFlight()) {
                System.out.println("만 15세 미만은 국제선 예약 불가입니다.");
            } else {
                System.out.println("결제 비밀 번호");
                String pw = sc.next();
                p = new Passenger(name, birthDate, pw);
                passengers.add(p);
            }
        } catch (Exception e) {
            System.out.println("생년월일을 6자리로 입력해 주세요. ex) 010225");
        }
    }

    public void checkReservation() {
        int index = search("예약 확인");
        checkPassword(index);
    }

    private void checkPassword(int index) {
        for (;;) {
            if (index != -1) {
                System.out.print("결제 비밀번호 > ");
                String pw = sc.next();
                System.out.println();
                if (passengers.get(index).getPw().equals(pw)) {
                    System.out.println("비밀번호가 일치합니다.");
                    System.out.println(ticketPrint(reservationMap, passengers.get(index).getName()));
                }
            }
        }
    }

    private String ticketPrint(Map<String, Flight> reservationMap, String name) {
        int index = -1;
        if (passengers != null) {
            for (int i = 0; i < passengers.size(); i++) {
                if (passengers.get(i).getName().equals(name)) {
                    index = i;
                }
            }
        }
        int seat = Integer.parseInt(passengers.get(index).getSeat()) + 1;
        return "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n\n" +
                "\t" + name + "님의 티켓정보" +
                "| 좌석 : " + seat + "번\n" +
                "." + reservationMap.get(name) + "\n\n" +
                "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ";
    }

    private int search(String str) {
        System.out.println("===================== " + str + " =====================");
        System.out.print("예약자 이름: ");
        String name = sc.next();
        sc.nextLine();
        int index = -1;
        if (passengers != null) {
            for (int i = 0; i < passengers.size(); i++) {
                if (passengers.get(i).getName().equals(name)) {
                    index = i;
                }
            }
        }
        return index;
    }
}
