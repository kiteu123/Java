package a0212.movie;

import java.io.FileWriter;

public class Ticket {

    public static void print(User user, Movie movie, int seat) {

        try {

            FileWriter fw = new FileWriter("ticket.txt", true);

            fw.write("==== 영화 티켓 ====\n");
            fw.write("이름: " + user.getName() + "\n");
            fw.write("전화: " + user.getPhone() + "\n");
            fw.write("영화: " + movie.getTitle() + "\n");
            fw.write("좌석: " + seat + "\n");
            fw.write("가격: " + movie.getFinalPrice() + "원\n");
            fw.write("==================\n\n");

            fw.close();

        } catch (Exception e) {

            System.out.println("파일 저장 오류");
        }
    }
}
