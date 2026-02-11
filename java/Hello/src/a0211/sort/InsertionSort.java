package a0211.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 63, 34, 25, 17, 22, 11, 90 };
    }

    private static void InsertionSort1(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = 1 - 1;
            while (j >= 0 && array[j] > key) {
                j--;
            }
            array[j + 1] = key;
        }
    }
}
