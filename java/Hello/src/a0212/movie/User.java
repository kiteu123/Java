package a0212.movie;

import java.util.ArrayList;

public class User {

    private String name;
    private String phone;

    private ArrayList<Integer> reservationNumbers;
    private ArrayList<String> reservedMovies;
    private ArrayList<Integer> reservedSeats;

    private static int counter = 1;

    private int totalPaid = 0;

    public User(String name, String phone) {

        this.name = name;
        this.phone = phone;

        reservationNumbers = new ArrayList<>();
        reservedMovies = new ArrayList<>();
        reservedSeats = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Integer> getReservationNumbers() {
        return reservationNumbers;
    }

    public ArrayList<String> getReservedMovies() {
        return reservedMovies;
    }

    public ArrayList<Integer> getReservedSeats() {
        return reservedSeats;
    }

    public int getTotalPaid() {
        return totalPaid;
    }

    public void addReservation(String title, int seat) {

        reservedMovies.add(title);
        reservedSeats.add(seat);

        reservationNumbers.add(counter++);
    }

    public void addTotalPaid(int money) {
        totalPaid += money;
    }

    public void showReservations() {

        System.out.println("\n예약 목록");

        for (int i = 0; i < reservedMovies.size(); i++) {

            System.out.println(
                    "번호: " + reservationNumbers.get(i) +
                            " | 영화: " + reservedMovies.get(i) +
                            " | 좌석: " + reservedSeats.get(i));
        }
    }

    public void cancelReservation(String title, int seat) {

        int index = reservedMovies.indexOf(title);

        if (index != -1 && reservedSeats.get(index) == seat) {

            reservedMovies.remove(index);
            reservedSeats.remove(index);
            reservationNumbers.remove(index);
        }
    }

    public void clearReservations() {

        reservedMovies.clear();
        reservedSeats.clear();
        reservationNumbers.clear();
    }
}
