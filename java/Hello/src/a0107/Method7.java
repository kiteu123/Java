import java.util.Scanner;

public class Method7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정육면체의 한 변의 길이 입력 : ");
        double n = sc.nextDouble();

        double v = volume(n);

        System.out.printf("한 변의 길이가 %.1f인 정육면체의 부피 %.1f", n, v);

        sc.close();
    }

    private static double volume(double n) {
        return n * n * n;
    }
}
