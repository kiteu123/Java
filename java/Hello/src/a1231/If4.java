package a1231;

public class If4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = 3;
        int max = 0;

        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println(max);
    }
}
