package a0102;

public class While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Hellow World " + i);
            i++;
        }

        // 10부터 1까지

        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        // 1~100의 합
        int sum = 0;
        int num = 1;
        while (num <= 100) {
            sum += num;
            num++;
            System.out.println(sum);
        }
    }
}
