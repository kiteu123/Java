package a0122.ex03;

import java.util.ArrayList;

public class NumberManager {

    public static void addNumber(ArrayList list, int num) {
        list.add(num);
    }

    public static int findMax(ArrayList list) {
        if (list.isEmpty()) {
            return -1;
        }
        int max = (int) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int value = (int) list.get(i);
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int findMin(ArrayList list) {
        if (list.isEmpty()) {
            return -1;
        }
        int min = (int) list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int value = (int) list.get(i);
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int getSum(ArrayList list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += (int) list.get(i);
        }
        return sum;
    }

}
