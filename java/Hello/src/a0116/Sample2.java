package a0116;

public class Sample2 {
    public static void main(String[] args) {
        int c;
        // System.out.println(c);
        try {
            c = 4 / 0;
        } catch (Exception e) {
            c = -1;
        }
        System.out.println(c);
    }
}
