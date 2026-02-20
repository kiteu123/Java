package a0220.lottery;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Lottery {

    String randomNum = "";
    int[] randomNumbers = new int[6];

    public void randomLotteryNum() {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int i = 0; i < 6; i++) {
            randomNumbers[i] = numbers.get(i);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (randomNumbers[i] > randomNumbers[j]) {
                    int temp = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[j];
                    randomNumbers[j] = temp;
                }
            }
        }
        randomNum = "";
        for (int i = 0; i < 6; i++) {
            if (i > 0)
                randomNum += " ";
            randomNum += String.format("%2d", randomNumbers[i]);
        }

    }

    // public static int random(int min, int max) {
    // int num = (int) ((Math.random() * (max - min + 1)) + min);
    // return num;
    // }

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
        int matchCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (p.customerNumbers[i] == randomNumbers[i]) {
                    matchCount++;
                    break;
                }
            }
        }
        System.out.println("[INFO] " + m.name + "님의 로또번호는 " + p.customerNum + "입니다.");
        if (matchCount == 6) {
            System.out.println("[INFO] 1등 당첨");
        } else if (matchCount == 5) {
            System.out.println("[INFO] 2등 당첨");
        } else if (matchCount == 4) {
            System.out.println("[INFO] 3등 당첨");
        } else if (matchCount == 3) {
            System.out.println("[INFO] 4등 당첨");
        } else {
            System.out.println("[INFO] 일치한 번호 : " + matchCount + "개");
            System.out.println("[INFO] 낙첨");
        }
        System.out.println(
                "============================================================================================");
        System.out.println("[INFO] 로또추첨이 완료되었습니다.");
    }
}
