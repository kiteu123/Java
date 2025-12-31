package a1231;

public class Ex05 {
    public static void main(String[] args) {
        // 윤년 : 4로 나누어 떨어지지만, 100으로 나누어 떨어지지않으면 윤년.
        // 400으로도나누어 떨어지면 윤년.

        // (4의 배수 && 100의 배수 아님 || 400의 배수)

        int year = 2014;
        boolean leapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        System.out.println(leapYear);

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " = 윤년");
        } else {
            System.out.println(year + " = 평년");
        }
    }
}
