package a1230;

public class Compare {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("===비교 연산자===");
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

        // 같음 비교
        System.out.println("\n===같음 비교===");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a == c: " + (a == c)); // true

        // 다름 비교
        System.out.println("\n===다름 비교===");
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a != c: " + (a != c)); // false

        // 크기 비교
        System.out.println("\n===크기 비교===");
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a >= c: " + (a >= c)); // true
        System.out.println("a <= b: " + (a <= b)); // true

        // 실용적인 예제
        System.out.println("\n===실용적인 예제===");
        // 나이 비교
        int age = 25;
        System.out.println("age: " + age);
        System.out.println("성인 여부 (만 18세 이상): " + (age >= 18));

        // 점수 비교
        int score = 85;
        System.out.println("score: " + score);
        System.out.println("합격 여부 (60점 이상): " + (score >= 60));

        // 문자열 비교
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println("\n===문자열 비교===");
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1.equals(str3): " + str1.equals(str3));

    }
}
