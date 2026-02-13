package a0212.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationManager {

    private ArrayList<Movie> movies;
    private ArrayList<User> users;
    private Scanner sc;

    private int discountRate = 0;

    public ReservationManager() {
        movies = new ArrayList<>();
        users = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // 영화 목록 출력
    public void showMovies() {

        System.out.println("\n현재 상영 영화");

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    // 예매
    public void movieReservation() {

        System.out.print("영화 제목: ");
        String title = sc.nextLine();

        System.out.print("이름: ");
        String userName = sc.nextLine();

        Movie movie = getMovie(title);

        if (movie == null) {
            System.out.println("영화 없음");
            return;
        }

        movie.getTheater().displaySeats();

        System.out.print("좌석 번호: ");
        int seat = Integer.parseInt(sc.nextLine());

        User user = getUser(userName);

        // 신규 사용자
        if (user == null) {

            System.out.print("전화번호: ");
            String phone = sc.nextLine();

            user = new User(userName, phone);
            users.add(user);
        }

        // 할인 체크
        if (user.getTotalPaid() >= 50000) {
            discountRate = 10;
        } else {
            discountRate = 0;
        }

        if (!movie.getTheater().reserveSeat(seat)) {
            System.out.println("이미 예약된 좌석");
            return;
        }

        user.addReservation(title, seat);

        int price = movie.getPrice();
        int discount = price * discountRate / 100;
        int finalPrice = price - discount;

        user.addTotalPaid(finalPrice);

        System.out.println("\n예매 완료");
        System.out.println("원가: " + price);
        System.out.println("할인율: " + discountRate + "%");
        System.out.println("결제금액: " + finalPrice);
    }

    // 예약 조회
    public void checkReservation() {

        System.out.print("이름: ");
        String name = sc.nextLine();

        User user = getUser(name);

        if (user == null || user.getReservedMovies().isEmpty()) {
            System.out.println("예약 없음");
            return;
        }

        user.showReservations();

        System.out.println("총 결제: " + user.getTotalPaid());
    }

    // 예약 취소
    public void cancelReservation() {

        System.out.print("이름: ");
        String name = sc.nextLine();

        User user = getUser(name);

        if (user == null || user.getReservedMovies().isEmpty()) {
            System.out.println("예약 없음");
            return;
        }

        user.showReservations();

        System.out.print("취소 번호: ");
        int num = sc.nextInt();
        sc.nextLine();

        int index = user.getReservationNumbers().indexOf(num);

        if (index == -1) {
            System.out.println("번호 오류");
            return;
        }

        String title = user.getReservedMovies().get(index);
        int seat = user.getReservedSeats().get(index);

        Movie movie = getMovie(title);

        if (movie != null) {
            movie.getTheater().cancelSeat(seat);
        }

        user.cancelReservation(title, seat);

        System.out.println("취소 완료");
    }

    // 전체 취소
    public void cancelAllReservation() {

        System.out.print("이름: ");
        String name = sc.nextLine();

        User user = getUser(name);

        if (user == null || user.getReservedMovies().isEmpty()) {
            System.out.println("예약 없음");
            return;
        }

        for (int i = 0; i < user.getReservedMovies().size(); i++) {

            String title = user.getReservedMovies().get(i);
            int seat = user.getReservedSeats().get(i);

            Movie movie = getMovie(title);

            if (movie != null) {
                movie.getTheater().cancelSeat(seat);
            }
        }

        user.clearReservations();

        System.out.println("전체 취소 완료");
    }

    // 티켓 출력
    public void printTicket() {

        System.out.print("이름: ");
        String name = sc.nextLine();

        User user = getUser(name);

        if (user == null || user.getReservedMovies().isEmpty()) {
            System.out.println("출력할 티켓 없음");
            return;
        }

        user.showReservations();

        System.out.print("예매번호: ");
        int num = sc.nextInt();
        sc.nextLine();

        int index = user.getReservationNumbers().indexOf(num);

        if (index == -1) {
            System.out.println("번호 오류");
            return;
        }

        String title = user.getReservedMovies().get(index);
        int seat = user.getReservedSeats().get(index);

        Movie movie = getMovie(title);

        Ticket.print(user, movie, seat);

        System.out.println("ticket.txt 저장 완료");
    }

    // 유저 찾기
    private User getUser(String name) {

        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    // 영화 찾기
    private Movie getMovie(String title) {

        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }
}
