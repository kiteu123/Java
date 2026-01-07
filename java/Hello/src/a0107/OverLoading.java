public class OverLoading {
    public static void main(String[] args) {
        int result1 = add(10, 20);
        System.out.println(result1);

        int result2 = add(10, 20, 30);
        System.out.println(result2);

        double result3 = add(10.5, 20.3);
        System.out.println(result3);

        double result4 = add(10, 20.3);
        System.out.println(result4);
    }

    private static double add(double d, double e) {
        return d + e;
    }

    private static double add(int d, double e) {
        return d + e;
    }

    private static int add(int i, int j, int k) {
        return i + j + k;
    }

    private static int add(int i, int j) {
        return i + j;
    }

}
