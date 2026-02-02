package a0202.coffee2;

import java.util.Map;

public class Customer {
    private int orderNum;
    private int money;
    private Map<String, Integer> coffeeOrder;

    public String getOrderNum() {
        return "고객" + orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCoffeeOrder(Map<String, Integer> coffeeOrder) {
        this.coffeeOrder = coffeeOrder;
    }

    public Map<String, Integer> getCoffeeOrder() {
        return coffeeOrder;
    }

    public Customer(int orderNum) {
        this.orderNum = orderNum;
        this.money = 20000;
    }

    // 고객1, 고객2 ... 하게 늘어나는 구조
    public String getOrderName() {
        return "고객" + orderNum;
    }
}
