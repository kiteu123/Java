package a1231;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID : ");
        String id = sc.next();

        System.out.print("PW : ");
        String pw = sc.next();

        if (id.equals("admin") && pw.equals("1234")) {
            System.out.println("LOGGED IN");
        } else {
            System.out.println("LOGIN FAILED");
        }

        sc.close();
    }
}
