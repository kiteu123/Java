package a0202.coffee2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Coffee {
    private static Coffee instance;// 싱글톤 (객체 하나만)

    private Coffee() {
    };

    public static Coffee getInstance() {
        if (instance == null) {
            instance = new Coffee();
        }
        return instance;
    }; // 객체를 하나만 만듦

    ArrayList<String> coffeeList;
    ArrayList<Integer> coffeePrice;
    Map<String, Integer> menu;

    public void getMenu() {
        menu = new LinkedHashMap<String, Integer>();
        coffeeList = new ArrayList<>();
        coffeePrice = new ArrayList<>();

        coffeeList.add("아메리카노");
        coffeeList.add("카푸치노");
        coffeeList.add("아이스 아메리카노");
        coffeeList.add("카라멜 마끼아또");
        coffeeList.add("카페라떼");
        coffeeList.add("카페모카");

        coffeePrice.add(2000);
        coffeePrice.add(4500);
        coffeePrice.add(2500);
        coffeePrice.add(4000);
        coffeePrice.add(3000);
        coffeePrice.add(3500);

        for (int i = 0; i < coffeeList.size(); i++) {
            menu.put(coffeeList.get(i), coffeePrice.get(i));
        }

        DecimalFormat f = new DecimalFormat("0,000원");
        StringBuffer st = new StringBuffer();
        st.append("\n\n")
                .append("+---------------------------------------------------+\n")
                .append("+------------------------메뉴판----------------------+\n")
                .append("|            Menu                   price           |\n");
        System.out.println(st.toString());
        int s = 1;
        for (Entry<String, Integer> get : menu.entrySet()) {
            System.out.printf(": [%d] %-20s\t %s          :\n", s, get.getKey(), f.format(get.getValue()));
            s++;
        }
        // menu("아메리카노", 2000)
        System.out.println("+----------------------------------------------------+\n");
    }
}
