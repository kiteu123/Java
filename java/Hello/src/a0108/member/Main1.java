package a0108.member;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Sign in===");
        System.out.print("아이디 입력 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 입력 : ");
        String pw = sc.nextLine();
        System.out.print("이름 입력 : ");
        String name = sc.nextLine();

        Member member = new Member(id, pw, name);
        member.showInfo();

        sc.close();
    }
}
