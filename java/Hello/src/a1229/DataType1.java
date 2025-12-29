package a1229;

public class DataType1 {
    public static void main(String[] args){
        // 정수형
        int age = 25;
        age = 30; // 변수 값 변경 가능
        long population = 7800000000L; // L 접미사로 long 타입 지정
    
        // 실수형
        double height = 175.5;
        float weight = 70.5f; // F 접미사로 float 타입 지정
        

        // 문자형
        char grade = 'A';
        

        // 논리형
        boolean isStudent = true;
       

        // 참조 자료형 (String)
        String name = "홍길동";
        

        // 상수형
        final double PI = 3.14159;
        final int MAX_SCORE = 100;
        

        // 출력
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Name: " + name);
        System.out.println("PI: " + PI);
        System.out.println("Max Score: " + MAX_SCORE);
    }
}
