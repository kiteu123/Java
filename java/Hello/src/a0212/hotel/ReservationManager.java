package a0212.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationManager {

    private ArrayList<Hotel> hotels;
    private ArrayList<User> users;

    private Scanner sc;

    private static ReservationTicket ticket;

    private int discountRate = 0;

    public ReservationManager() {

        hotels = new ArrayList<>();
        users = new ArrayList<>();
        sc = new Scanner(System.in);

        ticket = new ReservationTicket(this);
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public void showHotels() {

        if (hotels.isEmpty()) {
            System.out.println("등록된 호텔이 없습니다.");
            return;
        }

        for (Hotel h : hotels) {
            System.out.println(h);
        }
    }

    public void hotelReservation() {

        System.out.print("호텔 이름: ");
        String hotelName = sc.nextLine();

        System.out.print("사용자 이름: ");
        String userName = sc.nextLine();

        Hotel hotel = getHotel(hotelName);

        if (hotel == null) {
            System.out.println("해당 호텔이 없습니다.");
            return;
        }

        hotel.getRoom().displayRooms();

        System.out.print("방 번호 선택: ");
        int roomNum = sc.nextInt();
        sc.nextLine();

        boolean result = bookRoom(userName, hotelName, roomNum);

        if (!result) {
            System.out.println("예약 실패");
            return;
        }

        int price = hotel.getPrice();
        int finalPrice = price - (price * discountRate / 100);

        User user = getUser(userName);

        user.addTotalPaid(finalPrice);

        System.out.println("예약 성공!");
        System.out.println("결제금액: " + finalPrice + "원");
    }

    private boolean bookRoom(String userName, String hotelName, int roomNumber) {

        Hotel hotel = getHotel(hotelName);

        if (hotel == null)
            return false;

        boolean ok = hotel.getRoom().reserveRoom(roomNumber);

        if (!ok)
            return false;

        User user = getUser(userName);

        if (user == null) {
            user = new User(userName);
            users.add(user);
        }

        int num = user.addReservation(hotelName, roomNumber);

        System.out.println("예약번호: " + num);

        return true;
    }

    public User getUser(String userName) {

        for (User u : users) {

            if (u.getName().equals(userName)) {
                return u;
            }
        }
        return null;
    }

    public Hotel getHotel(String hotelName) {

        for (Hotel h : hotels) {

            if (h.getName().equals(hotelName)) {
                return h;
            }
        }
        return null;
    }

    public void checkReservation() {

        System.out.print("이름: ");
        String name = sc.nextLine();

        User user = getUser(name);

        if (user == null) {
            System.out.println("예약 내역 없음");
            return;
        }

        user.showReservations();
    }

    public void cancelReservation() {

        System.out.print("이름: ");
        String name = sc.nextLine();

        User user = getUser(name);

        if (user == null) {
            System.out.println("사용자 없음");
            return;
        }

        user.showReservations();

        System.out.print("취소할 예약번호: ");
        int num = sc.nextInt();
        sc.nextLine();

        int idx = user.getIndexByReservationNum(num);

        if (idx == -1) {
            System.out.println("없는 번호");
            return;
        }

        String hotelName = user.getHotelByIndex(idx);
        int room = user.getRoomByIndex(idx);

        Hotel hotel = getHotel(hotelName);

        hotel.getRoom().cancelRoom(room);

        user.removeByIndex(idx);

        System.out.println("취소 완료");
    }

    public void cancelAllReservation() {

        System.out.print("이름: ");
        String name = sc.nextLine();

        User user = getUser(name);

        if (user == null)
            return;

        for (Hotel h : hotels) {
            user.removeReservationsByHotel(h.getName());
        }

        user.clearReservations();

        System.out.println("전체 취소 완료");
    }

    public void printTicket() {

        System.out.print("예약번호: ");
        int num = sc.nextInt();
        sc.nextLine();

        ticket.printTicket(num);
    }

    public String getReservationDetails(int num) {

        for (User u : users) {

            int idx = u.getIndexByReservationNum(num);

            if (idx != -1) {

                return "예약번호: " + num +
                        " | 호텔: " + u.getHotelByIndex(idx) +
                        " | 방: " + u.getRoomByIndex(idx);
            }
        }
        return null;
    }

    public void setDiscountRate(Scanner sc) {

        System.out.print("할인율(%): ");
        discountRate = sc.nextInt();
        sc.nextLine();
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
