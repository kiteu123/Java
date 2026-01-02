package a1231;

public class If5 {
    public static void main(String[] args) {
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // 삼항 연산자
        // 조건식 ? 값1 : 값2;
        // true 면 값1, false면 값2
        String result = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(number + "은" + result + "입니다.");
    }
}
