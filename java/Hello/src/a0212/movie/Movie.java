package a0212.movie;

import java.text.DecimalFormat;

public class Movie {

    private String title;
    private String showtime;
    private int price;
    private Theater theater;

    private DecimalFormat format = new DecimalFormat("#,###원");

    public Movie(String title, String showtime, int price, int seatCount) {

        this.title = title;
        this.showtime = showtime;
        this.price = price;
        this.theater = new Theater(seatCount);
    }

    public String getTitle() {
        return title;
    }

    public String getShowtime() {
        return showtime;
    }

    public int getPrice() {
        return price;
    }

    public Theater getTheater() {
        return theater;
    }

    public int getFinalPrice() {
        return price;
    }

    @Override
    public String toString() {

        return "영화: " + title +
                " | 시간: " + showtime +
                " | 가격: " + format.format(price) +
                " | 남은좌석: " + theater.getAvailableSeats();
    }
}
