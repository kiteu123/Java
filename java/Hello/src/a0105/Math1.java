package a0105;

import java.util.Random;

public class Math1 {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.round(3.6)); // 반올림
        System.out.println(Math.ceil(3.6)); // 올림
        System.out.println(Math.floor(3.6)); // 내림
        double r = Math.random();
        int k = (int) (r * 45) + 1;
        System.out.println("Random Number * 45 : " + k);
        Random random = new Random();
        int n = random.nextInt(45);
        System.out.println("Random Number1 * 45 : " + n);
    }
}
