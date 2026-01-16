package a0116;

public class Sample2_1 {
    public static void main(String[] args) {
        Sample2_1 sample = new Sample2_1();
        int c;
        try {
            c = 4 / 0;
            sample.shouldRun();
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            sample.shouldRun();
        }
        System.out.println(c);
    }

    private void shouldRun() {
        System.out.println("OK Thanks");
    }
}
