package a0102;

public class Switch3 {
    public static void main(String[] args) {
        // 여러 case 묶기
        int month = 12;
        switch (month) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
