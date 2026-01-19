package a0119;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCompareList {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int a : arr) {
            System.out.print(a + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 20) {
                System.out.println("\n찾음");
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        for (int a : list) {
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println(list);

        // list.remove(1);

        System.out.println(list);

        // list.set(1, 99);

        System.out.println(list);

        if (list.contains(20)) {
            System.out.println("있음");
        }

        int index = list.indexOf(20);

        System.out.println(index);

        String[] arr1 = { "사과", "배" };
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));

        System.out.println(list1);
    }
}
