package a0219.lottery;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Lottery {

    String randomNum = "";
    String[] randomNumbers = new String[6];

    public void randomLotteryNum() {
        for (int i = 0; i < 6; i++) {
            randomNum += random(0, 9);
        }
        this.randomNum = randomNum;
    }

    public static int random(int min, int max) {
        int num = (int) ((Math.random() * (max - min + 1)) + min);
        return num;
    }

    public void lotteryNum() {
        System.out.println("\n[INFO] 로또 당첨 번호 안내 드립니다.");
        System.out.println("\n★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        System.out.println("★☆★☆★☆★☆★☆[" + randomNum + "]★☆★☆★☆★☆★☆");
        System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar time = Calendar.getInstance();
        String format_time1 = format1.format(time.getTime());
        System.out.println((format_time1));

        System.out.println("\n======================================================================================");
    }

    public void result() {
        Membership m = Membership.getInstance();
        Purchase p = Purchase.getInstance();
        System.out.println("[INFO] " + m.name + "님의 당첨 결과 3초 후에 안내드립니다.");
        System.out.println("\n=======================================================================================");
        Loading l = new Loading();
        l.loading();
        if (p.customerNum.equals(randomNum)) {
            System.out.println("[INFO] " + m.name + "님의 로또번호는 " + p.customerNum + "입니다.");
            System.out.println("[INFO]축하드립니다. 로또에 당첨되셨습니다.");
        } else {
            System.out.println("[INFO] " + m.name + "님의 로또번호는 " + p.customerNum + "입니다.");
            System.out.println("[INFO] 당첨번호는 " + randomNum + "입니다.");
            System.out.println("[INFO] 아쉽게도 당첨되지 않으셨습니다.");
        }
        System.out.println(
                "============================================================================================");
        System.out.println("[INFO] 로또추첨이 완료되었습니다.");
    }
}
