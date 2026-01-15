package a0115;

import java.util.ArrayList;

public class ArrayList3 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");

        String fruit1 = fruits.get(0);
        String fruit2 = fruits.get(1);
        String fruit3 = fruits.get(2);

        System.out.println("첫 번째 과일 : " + fruit1);
        System.out.println("두 번째 과일 : " + fruit2);
        System.out.println("세 번째 과일 : " + fruit3);
        System.out.println();

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + " 번째 과일 : " + fruits.get(i));
        }
        System.out.println();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
        fruits.set(1, "포도");

        System.out.println("수정 후 : " + fruits);
        System.out.println();

        fruits.remove(1);
        fruits.remove("사과");
        System.out.println("삭제 후 :" + fruits);

        System.out.println();
        fruits.clear();

        System.out.println("전체 삭제 후 : " + fruits);

    }
}
