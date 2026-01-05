package a0105;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        // 사용자로부터 정수 3개를 입력받아 저장 출력하시오
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[3];

        System.out.print("정수 입력 : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
