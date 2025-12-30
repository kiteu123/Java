package a1230;

public class Increasement {
    public static void main(String[] args) {
        System.out.println("=== 전위 증가 연산자 (++변수) ===");
        int a = 5;
        System.out.println("초기값 a = " + a);
        a++;
        System.out.println("a++ 후 값: " + a);

        int b = ++a;
        System.out.println("b = ++a 실행 후: ");
        System.out.println("현재 a 값: " + a);
        System.out.println("현재 b 값 : " + b);

        System.out.println("\n=== 후위 증가 연산자 (변수++) ===");
        int c = 5;
        System.out.println("초기값 c = " + c);

        int d = c++;
        System.out.println("d = c++ 실행 후:");
        System.out.println("c = " + c); // 6
        System.out.println("d = " + d); // 5
    }
}
