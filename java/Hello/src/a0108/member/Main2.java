package a0108.member;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Member[] members = new Member[3];

        for (int i = 0; i < members.length; i++) {
            System.out.println("===Sign in " + (i + 1) + "번=== ");
            System.out.print("아이디 입력 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 입력 : ");
            String pw = sc.nextLine();
            System.out.print("이름 입력 : ");
            String name = sc.nextLine();
            members[i] = new Member(id, pw, name);
        }

        System.out.println("\n ===전체 회원 목록===");
        for (int i = 0; i < members.length; i++) {
            members[i].showInfo();
        }

        for (Member m : members) {
            m.showInfo();
        }

        sc.close();
    }
}
