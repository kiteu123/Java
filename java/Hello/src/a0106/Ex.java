package a0106;

public class Ex {

    public static void main(String[] args) {

        // 문제 1번
        // 1. int[] arr= {1,2,3};
        // 2. int arr[3];
        // 3. int[] arr = new int[3];
        // 4. int arr[3] = new int[3];
        System.out.println("===문제 1번===");
        System.out.println("2, 4번");

        // 문제 2번
        int[][] arr = {
                { 1 },
                { 1, 2 },
                { 1, 2, 3 },
                { 1, 2, 3, 4 }
        };
        System.out.println("===문제 2번===");
        System.out.println("arr의 길이 : " + arr.length);
        System.out.println("arr[2]의 길이 : " + arr[2].length);

        // 문제 3번
        int[] score = { 90, 80, 60, 100 };

        int totalScore = 0;
        double avgScore = 0;

        int i;
        for (i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        avgScore = (double) totalScore / score.length;
        System.out.println("===문제 3번===");
        System.out.println("합계 점수 : " + totalScore);
        System.out.println("평균 점수 : " + avgScore);

        // 문제 4번
        System.out.println("===문제 4번===");
        int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] num2 = new int[10];

        for (i = 0; i < num1.length; i++) {
            num2[i] = num1[i] * num1[i];
        }

        for (i = 0; i < num2.length; i++) {
            System.out.println(num2[i] + " ");
        }
    }
}
