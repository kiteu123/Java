package a0105;

import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args) {
        // int avg = 85;
        Scanner sc = new Scanner(System.in);
        
        int avg = sc.nextInt();

        char hak;
        if (avg >= 90) {
            hak = 'A';
        } else if (avg >= 80) {
            hak = 'B';
        } else if (avg >= 70) {
            hak = 'C';
        } else if (avg >= 60) {
            hak = 'D';
        } else {
            hak = 'F';
        }
        System.out.println("당신의 학점은 " + hak + "입니다");

        sc.close();
    }
}
