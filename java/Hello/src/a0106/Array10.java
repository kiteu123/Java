package a0106;

public class Array10 {
    public static void main(String[] args) {
        int[][] arr = {
                { 3, 7, 2 },
                { 9, 4, 1 }
        };

        int max = arr[0][0];
        // 2차원 배열의 최대값 찾기
        int i, j;

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);

        int min = arr[0][0];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
