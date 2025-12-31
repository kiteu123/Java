package a1231;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // ## 문제 9: 중첩 if문 - 운전 가능 여부
        // 나이와 면허 보유 여부를 확인하여 운전 가능 여부를 판별하는 프로그램을 작성하세요.

        // **조건:**
        // - 18세 이상이면서 면허를 보유한 경우: "운전 가능합니다"
        // - 18세 이상이지만 면허가 없는 경우: "면허가 필요합니다"
        // - 18세 미만인 경우: "미성년자는 운전할 수 없습니다"

        // **요구사항:**
        // - 중첩 if 문 사용
        // - 면허 보유 여부는 boolean 변수로 표현

        Scanner sc = new Scanner(System.in);

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("면허여부 (Y/N) : ");
        String license = sc.next().toLowerCase();
        boolean isLicense;
        if (license.equals("y") || license.equals("yes")) {
            isLicense = true;
        } else {
            isLicense = false;
        }

        if (age >= 18) {
            if (isLicense) {
                System.out.println("운전 가능");
            } else {
                System.out.println("면허 필요");
            }
        } else {
            System.out.println("미성년자 운전 불가");
        }
        sc.close();
    }
}
