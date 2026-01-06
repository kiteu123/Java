package a0106;

public class Array11 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int num = 1;
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
