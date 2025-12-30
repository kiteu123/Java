package a1230;

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println("===자동 타입 변환===");

        // 1. 정수 -> 실수 자동 타입 변환 int -> double
        int inValue = 100;
        double douValue = inValue; // int -> double 자동 타입 변환
        System.out.println("inValue: " + inValue);
    }
}
