package a1231;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.println(name + " 님의 나이는 " + age);

        // 한 줄 전체 입력 -> sc.nextLine();
        // 문자 1개 입력받기 -> char ch = sc.next().charAt(0);

        sc.close();
    }
}
