package a0105;

public class Array5 {
    public static void main(String[] args) {

        int num[] = { 85, 70, 90, 60, 75 };

        int sum = 0;
        int avg;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        avg = sum / num.length;

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > avg) {
                count++;
            }
        }

        int[] highScores = new int[count];

        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > avg) {
                highScores[index++] = num[i];
            }
        }
        System.out.println("평균 : " + avg);
        System.out.print("평균 이상 점수 : ");
        for (int i = 0; i < highScores.length; i++) {
            System.out.print(highScores[i] + " ");
        }
    }
}
