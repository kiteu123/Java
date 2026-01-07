public class RandomNum {
    public static void main(String[] args) {
        int n = rollDie();
        System.out.printf("주사위의 눈 : %d", n);
    }

    private static int rollDie() {
        double x = 6 * Math.random();
        int temp = (int) x;

        return temp + 1;
    }
}
