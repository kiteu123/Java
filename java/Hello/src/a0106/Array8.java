package a0106;

public class Array8 {
    public static void main(String[] args) {
        int sum = 0;
        int i, j;
        int[][] arr = {
                { 10, 20 },
                { 30, 40 },
                { 50, 60 }
        };

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("모든 요소의 합 : " + sum);
    }
}
