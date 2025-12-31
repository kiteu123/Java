package a1231;

public class Ex04 {
    public static void main(String[] args) {
        int age = 5;
        double height = 130;
        boolean parent = true;
        boolean heartDisease = false;

        if (!heartDisease && height >= 120 && (age >= 6 || (age < 6 && parent))) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }
    }
}
