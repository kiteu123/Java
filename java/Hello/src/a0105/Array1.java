package a0105;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(numbers[3]);

        int[] nums = { 10, 20, 30, 40, 50 };
        System.out.println(nums[0]);

        for (int i = 0; i <= 4; i++) {
            System.out.println(nums[i]);
        }

        int i;

        for (i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
