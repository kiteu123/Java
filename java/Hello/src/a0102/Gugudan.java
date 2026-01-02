package a0102;

public class Gugudan {
    public static void main(String[] args) {
        // 구구단

        for (int i = 2; i <= 9; i++) {
            System.out.println("******** " + i + "단 ********");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }

        // 가로 출력 구구단
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " X " + i + " = " + (i * j) + " ");
            }
        }
        System.out.println("\n");
        // 가로 출력 구구단 세로줄 맞추기
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d X %d = %2d\t", j, i, i * j);
            }
            System.out.println();
        }

    }
}
