package a0108.student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어 점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학 점수 : ");
            int math = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(name, kor, eng, math);
        }

        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();
        }

        sc.close();
    }
}
