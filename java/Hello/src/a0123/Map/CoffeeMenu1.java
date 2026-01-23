package a0123.Map;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMenu1 {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("아메리카노", 4000);
        menu.put("카페라떼", 4500);
        menu.put("카푸치노", 5000);
        menu.put("에스프레소", 3500);
        menu.put("바닐라라떼", 5500);

        System.out.println("=== 커피 메뉴 ===");
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            int price = entry.getValue();
            String coffee = entry.getKey();
            System.out.println(coffee + " : " + price + "원");
        }
    }
}
