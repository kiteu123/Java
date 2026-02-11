package a0211;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("배열 크기: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("숫자 입력:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        System.out.println("정렬 결과:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
