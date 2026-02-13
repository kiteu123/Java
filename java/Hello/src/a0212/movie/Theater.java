package a0212.movie;

import java.util.ArrayList;

public class Theater {

    private ArrayList<String> seats;

    public Theater(int count) {

        seats = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            seats.add(String.valueOf(i + 1));
        }
    }

    public int getAvailableSeats() {

        int cnt = 0;

        for (String s : seats) {
            if (!s.equals("X"))
                cnt++;
        }

        return cnt;
    }

    public void displaySeats() {

        System.out.println("\n좌석표(X=예약)");

        for (int i = 0; i < seats.size(); i++) {

            System.out.printf("%2s ", seats.get(i));

            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        System.out.println();
    }

    public boolean reserveSeat(int num) {

        if (num <= 0 || num > seats.size())
            return false;

        if (seats.get(num - 1).equals("X"))
            return false;

        seats.set(num - 1, "X");

        return true;
    }

    public void cancelSeat(int num) {

        if (num <= 0 || num > seats.size())
            return;

        if (seats.get(num - 1).equals("X")) {
            seats.set(num - 1, String.valueOf(num));
        }
    }
}
