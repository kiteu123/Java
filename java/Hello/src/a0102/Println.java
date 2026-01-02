package a0102;

public class Println {
    public static void main(String[] args) {
        int age = 20;
        System.out.println("나이는 " + age + "살입니다.");
        System.out.printf("나이는 %d살 입니다.\n", age);

        double avg = 87.456;
        System.out.printf("Average : %.1f ", avg);
    }
}
