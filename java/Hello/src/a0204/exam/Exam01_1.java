package a0204.exam;

import java.util.Arrays;

public class Exam01_1 {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 1, 5, 8, 4, 6 };

        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(0);
        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);

        double average = Arrays.stream(arr).average().orElse(0);
        System.out.printf("평균값 : %.2f\n", average);

        int[] evenArray = Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
        System.out.println("짝수 배열 : " + Arrays.toString(evenArray));

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        System.out.println("정렬된 배열 : " + Arrays.toString(sortedArr));
    }
}
