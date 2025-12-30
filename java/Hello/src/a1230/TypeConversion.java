package a1230;

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("===자동 타입 변환===");

        // int -> double 자동 타입 변환
        int inValue = 100;
        double doubleValue = inValue; // int -> double 자동 타입 변환
        System.out.println("inValue: " + inValue + " -> doubleValue: " + doubleValue);

        // long -> float 자동 타입 변환
        long longValue = 1000000L;
        float floatValue = longValue; // long -> float 자동 타입 변환
        System.out.println("longValue: " + longValue + " -> floatValue: " + floatValue);

        // char -> int 자동 타입 변환
        char charValue = 'B';
        int charToIntValue = charValue; // char -> int 자동 타입 변환
        System.out.println("charValue: " + charValue + " -> charToIntValue: " + charToIntValue);

        // double -> int 강제 타입 변환
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("pi: " + pi + " -> intPi: " + intPi);

        // int -> char 강제 타입 변환
        int intChar = 67;
        char charFromInt = (char) intChar;
        System.out.println("intChar: " + intChar + " -> charFromInt: " + charFromInt);

        // 큰 범위 -> 작은 범위 (데이터 손실 가능)
        int bigNum = 300;
        byte smallNum = (byte) bigNum; // int -> byte 강제 타입 변환
        System.out.println("bigNum: " + bigNum + " -> smallNum: " + smallNum + " (데이터 손실)");

        System.out.println("\n===실용적인 예제===");

        // 정수 나눗셈을 실수로 변환
        int a = 10;
        int b = 3;
        double result1 = a / b; // a를 double로 강제 변환
        double result2 = (double) a / b; // a를 double로 강제 변환
        System.out.println("정수 나눗셈: " + a + " / " + b + " = " + result1);
        System.out.println("정수 나눗셈: " + a + " / " + b + " = " + result2);
    }
}
