public class Hw1 {
    public static void main(String[] args) {
        double oil = 8.86;
        double distance = 182.736;

        double y = yeonbi(oil, distance);

        System.out.printf("연비 : %.2f km/L ", y);
    }

    private static double yeonbi(double oil, double distance) {
        return distance / oil;
    }
}
