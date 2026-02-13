package a0212.hotel;

import java.util.ArrayList;

public class User {

    private String name;

    private ArrayList<Integer> reservationNumbers;
    private ArrayList<String> reservedHotels;
    private ArrayList<Integer> reservedRooms;

    private static int reservationCounter = 1;

    private int totalPaid = 0;

    public User(String name) {
        this.name = name;

        reservationNumbers = new ArrayList<>();
        reservedHotels = new ArrayList<>();
        reservedRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public int addReservation(String hotelName, int roomNumber) {

        int num = reservationCounter++;

        reservationNumbers.add(num);
        reservedHotels.add(hotelName);
        reservedRooms.add(roomNumber);

        return num;
    }

    public void addTotalPaid(int amount) {
        totalPaid += amount;
    }

    public void showReservations() {

        if (reservationNumbers.isEmpty()) {
            System.out.println("예약 내역이 없습니다.");
            return;
        }

        for (int i = 0; i < reservationNumbers.size(); i++) {

            System.out.println("예약번호: " + reservationNumbers.get(i)
                    + " | 호텔: " + reservedHotels.get(i)
                    + " | 방: " + reservedRooms.get(i));
        }
    }

    public boolean cancelReservation(String hotelName, int roomNumber) {

        for (int i = 0; i < reservedHotels.size(); i++) {

            if (reservedHotels.get(i).equals(hotelName)
                    && reservedRooms.get(i) == roomNumber) {

                reservationNumbers.remove(i);
                reservedHotels.remove(i);
                reservedRooms.remove(i);

                return true;
            }
        }
        return false;
    }

    public void clearReservations() {

        reservationNumbers.clear();
        reservedHotels.clear();
        reservedRooms.clear();
    }

    public void removeReservationsByHotel(String hotelName) {

        for (int i = reservedHotels.size() - 1; i >= 0; i--) {

            if (reservedHotels.get(i).equals(hotelName)) {

                reservationNumbers.remove(i);
                reservedHotels.remove(i);
                reservedRooms.remove(i);
            }
        }
    }

    public int getIndexByReservationNum(int num) {

        return reservationNumbers.indexOf(num);
    }

    public String getHotelByIndex(int idx) {
        return reservedHotels.get(idx);
    }

    public int getRoomByIndex(int idx) {
        return reservedRooms.get(idx);
    }

    public void removeByIndex(int idx) {

        reservationNumbers.remove(idx);
        reservedHotels.remove(idx);
        reservedRooms.remove(idx);
    }
}
