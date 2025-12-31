package a1231;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // ## 문제 10: 복합 조건 - 입장료 계산
        // 나이와 학생 여부에 따라 입장료를 계산하는 프로그램을 작성하세요.

        // **입장료 기준:**
        // - 65세 이상: 무료
        // - 학생(초등학생~대학생): 50% 할인 (기본 요금 10,000원)
        // - 일반 성인: 10,000원
        // - 7세 미만: 무료

        // **요구사항:**
        // - if-else if-else 문 사용
        // - 나이와 학생 여부를 변수로 저장
        // - 최종 입장료를 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("학생 여부 (Y/N) : ");
        String student = sc.next().toLowerCase();

        if (age >= 65 || age < 7) {
            System.out.println("입장료 : 무료");
        } else if (age < 65 && age > 19) {
            System.out.println("입장료 : 10,000원");
        } else if (student.equals("y") || student.equals("yes")) {
            System.out.println("입장료 : 5,000원");
        } else {
            System.out.println("입장료 : 10,000원");
        }
        sc.close();
    }
}
