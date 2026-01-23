package a0123.Map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("홍길동", 85);
        scores.put("김철수", 90);
        scores.put("이영희", 88);

        for (String name : scores.keySet()) {
            System.out.println(name + " = " + scores.get(name));
        }

        for (Integer score : scores.values()) {
            System.out.println(score);
        }

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
