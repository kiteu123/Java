package a1229;

public class Int1 {
    public static void main(String[] args) {
        int var1 = 10;
        System.out.println(var1);
        // int 2var = 20; 오류: 변수 이름은 숫자로 시작할 수 없음
        int _var2 =20;
        System.out.println(_var2);
        int $var3 =30;
        System.out.println($var3);
        // int #var4 =40; 오류: 변수 이름에 특수문자 # 사용 불가
        // int var5 =10000000000; 오류: int 범위 초과
        long var6 =10000000000L; // L 접미사로 long 타입 지정
        System.out.println(var6);
        double doubleVar = 3.14159265358979323846;
        System.out.println(doubleVar);
        float floatVar = 3.14F; // F 접미사로 float 타입 지정
        System.out.println(floatVar);
        byte byteVar = 127; // byte 범위: -128 ~ 127
        System.out.println(byteVar);
        short shortVar = 32767; // short 범위: -32768 ~ 32767
        System.out.println(shortVar);

        // 문자형
        char charVar = 'A'; 
        System.out.println(charVar);
        char koreanChar = '가';
        System.out.println(koreanChar);
        char unicodeChar = '\u0041'; // 유니코드로 'A' 표현
        System.out.println(unicodeChar); 

        // 논리형
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);
        boolean result = (5 > 3);
        System.out.println(result);

    }
}
