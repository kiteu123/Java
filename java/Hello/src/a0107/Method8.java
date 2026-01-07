import java.util.Scanner;

public class Method8 {
    public static void main(String[] args) {

        double one = 180 * 5.179;

        Scanner sc = new Scanner(System.in);
        System.out.print("삼겹살 몇 인분? : ");
        int inbun = sc.nextInt();

        double k = cal(inbun, one);

        System.out.print("총 칼로리 : " + k + "kcal");

        sc.close();
    }

    private static double cal(int inbun, double one) {
        return one * inbun;
    }
}
