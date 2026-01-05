package a0105;

public class Ifelse {
    public static void main(String[] args) {
        int avg = 85;
        char hak;
        if (avg >= 90) {
            hak = 'A';
        } else if (avg >= 80) {
            hak = 'B';
        } else if (avg >= 70) {
            hak = 'C';
        } else if (avg >= 60) {
            hak = 'D';
        } else {
            hak = 'F';
        }
        System.out.println("당신의 학점은 " + hak + "입니다");
    }
}
