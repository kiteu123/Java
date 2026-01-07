public class Ex06 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        print(x);
        System.out.println(x);
    }

    public static void print(int x) {
        System.out.println(x);
        x += 10;
        System.out.println(x);
    }
}
