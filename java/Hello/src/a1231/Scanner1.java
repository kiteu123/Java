package a1231;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("연도 입력 : ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " = 윤년");
        } else {
            System.out.println(year + " = 평년");
        }

        sc.close();
    }
}
