package a0105;

public class Array3 {
    public static void main(String[] args) {
        // 문제
        int[] arr = { 5, 8, 3, 10, 2 };
        int max = arr[0];
        // 배열에 들어있는 수 중 가장 큰 수 출력
        // 힌트 arr[i] max값을 비교해서 arr[i] 크면 arr[i] = max

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            // System.out.println(max);
        }
        System.out.println(max);

    }
}
