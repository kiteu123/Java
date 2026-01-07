public class Method1 {
    public static void main(String[] args) {
        int result = sum(10, 20);
        int result1 = sum(30, 40);
        System.out.println(result);
        System.out.println(result1);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
