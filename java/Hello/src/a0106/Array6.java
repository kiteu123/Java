package a0106;

public class Array6 {
    public static void main(String[] args) {
        // int[] arr6 = {1,2,3,4,5};
        // int[][] arr = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // int[][] arr = new int[2][3];
        // arr[0][0] = 10;
        // arr[0][1] = 20;
        // arr[0][2] = 30;

        // arr[1][0] = 40;
        // arr[1][1] = 50;
        // arr[1][2] = 60;

        int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
