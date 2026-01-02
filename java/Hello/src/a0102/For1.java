package a0102;

public class For1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        for (int k = 0; k <= 10; k += 2) {
            System.out.println(k);
        }

        int sum = 0;
        for (int m = 1; m <= 10; m++) {
            sum += m;
        }
        System.out.println("1~10 합: " + sum);

        System.out.println("1~20 중 짝수 :");
        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        System.out.println("구구단 2단 : ");
        for (int l = 1; l <= 9; l++) {

            System.out.println("2 X " + l + " = " + (2 * l));
        }

        int j;
        for (j = 1; j <= 9; j++) {
            System.out.println(j + " ");
        }
        System.out.println("\nfor 문 종료 후 j 값 : " + j);
    }
}
