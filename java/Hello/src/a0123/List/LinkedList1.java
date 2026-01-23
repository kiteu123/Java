package a0123.List;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("첫 번째");
        list.add("두 번째");
        list.add("세 번째");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.add("네 번째");
        System.out.println("출력 2");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.addFirst("맨 앞");
        list.addLast("맨 뒤");
        System.out.println("출력3");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(2);

        for (String e : list) {
            System.out.println(e);
        }
    }
}
