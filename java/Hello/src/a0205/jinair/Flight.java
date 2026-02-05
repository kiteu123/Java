package a0205.jinair;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Flight {
    private String destination;
    private String time;
    private int price;
    private DecimalFormat priceFormat = new DecimalFormat("#,###원");
    private boolean internatinalFlight;
    private ArrayList<String> seats;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DecimalFormat getPriceFormat() {
        return priceFormat;
    }

    public void setPriceFormat(DecimalFormat priceFormat) {
        this.priceFormat = priceFormat;
    }

    public boolean getInternationalFlight() {
        return internatinalFlight;
    }

    public void setInternatinalFlight(boolean internatinalFlight) {
        this.internatinalFlight = internatinalFlight;
    }

    public ArrayList<String> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<String> seats) {
        this.seats = seats;
    }

    public Flight(String destination, String time, int price, boolean internatinalFlight) {
        this.destination = destination;
        this.time = time;
        this.price = price;
        this.internatinalFlight = internatinalFlight;
        seats = new ArrayList<String>();
        for (int i = 1; i <= 20; i++) {
            seats.add(i + "");
        }
    }

    @Override
    public String toString() {
        String priceComma = priceFormat.format(price);
        return "Flight [destination=" + destination + ", time=" + time + ", price=" + priceComma + "]";
    }

    public void seatToString() {
        for (int i = 0; i < seats.size() - 3; i += 4) {
            System.out.printf("|    [%2s]\t\t[%2s][%2s]\t\t[%2s]    |\n", seats.get(i), seats.get(i + 1),
                    seats.get(i + 2), seats.get(i + 3));
        }
    }
}
