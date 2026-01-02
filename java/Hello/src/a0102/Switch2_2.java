package a0102;

public class Switch2_2 {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            case 4 -> "Thu";
            case 5 -> "Fri";
            case 6 -> "Sat";
            case 7 -> "Sun";
            default -> "Err";
        }; // 값을 반환하는 표현식이어서 ; 가 필요
        System.out.println(dayName);
    }
}
