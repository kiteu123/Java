package a0202.book;

import java.util.LinkedHashMap;
import java.util.Map;

public class Member {
    private int memberNo;
    private int money = 30000;

    private Map<Integer, Integer> rentList = new LinkedHashMap<>();

    public Member(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public int getMoney() {
        return money;
    }

    public void minusMoney(int amount) {
        money -= amount;
    }

    public Map<Integer, Integer> getRentList() {
        return rentList;
    }

    public void addRent(int bookNo, int days) {
        if (rentList.containsKey(bookNo)) {
            int old = rentList.get(bookNo);
            rentList.put(bookNo, old + days);
        } else {
            rentList.put(bookNo, days);
        }
    }
}
