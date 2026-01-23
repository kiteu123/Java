package a0123.List;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 요소 추가
        set.add("사과");
        set.add("바나나");
        set.add("오렌지");
        set.add("사과"); // 중복 추가 시도 (무시됨)

        for (String item : set) {
            System.out.println(item);
        }

        System.out.println(set.size());

        boolean hasApple = set.contains("사과");
        System.out.println(hasApple);

        set.remove("바나나");

        for (String item : set) {
            System.out.println(item);
        }
        System.out.println("순서있는 입/출력");
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("사과");
        set1.add("바나나");
        set1.add("오렌지");

        for (String item : set1) {
            System.out.println(item);
        }
    }
}
