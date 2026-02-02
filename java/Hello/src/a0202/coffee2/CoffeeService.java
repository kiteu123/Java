package a0202.coffee2;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeService {
    private boolean reOrder = false;
    private int orderNum = 1;
    Map<String, Integer> orderList;

    public CoffeeService() {
        orderList = new LinkedHashMap<>();
    }

    Coffee coffee = Coffee.getInstance();
    Customer customer;

    Thread t = new Thread();

    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("\n어서오세요.");
        customer = new Customer(orderNum);
        coffee.getMenu();
        order();
        totalOrder(customer);
        try {
            System.out.println("기다려 주시면 주문하신 음료가 나옵니다.");
            t.sleep(2000);
            end();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void end() {
        int s = 1;
        StringBuffer message = new StringBuffer();
        message.append("\n\n ")
                .append("+----------------------------------------------------+\n ")
                .append("|                                                    | \n ")
                .append("|           " + customer.getOrderName() + " 고객님 주문하신 음료 나왔습니다         | " + "\n");
        System.out.print(message);
        for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
            System.out.printf(" | [%d] %-20s : %2d잔  %7s |\n", s, order.getKey(), order.getValue(), "");
            s++;
        }
        System.out.println(" |                                                    |");
        System.out.println(" +----------------------------------------------------+");
    }

    private void totalOrder(Customer customer2) {
        int s = 1;
        int totalMoney = 0;
        int coffeePrice = 0;
        DecimalFormat f = new DecimalFormat("###,000");
        String name = customer.getOrderName() + "번";
        StringBuffer message = new StringBuffer();
        message.append("\n\n ")
                .append("+----------------------------------------------------+\n ")
                .append("|                                                    | \n ")
                .append("|             " + name + "고객님의 주문 내역 입니다         | " + "\n");
        for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
            String coffeeName = order.getKey();
            int orderCount = order.getValue();
            int coffeeUnitPrice = coffee.menu.get(coffeeName);
            coffeePrice = coffeeUnitPrice * orderCount;
            totalMoney = totalMoney + coffeePrice;
            String pay = f.format(coffeePrice);
            message.append(String.format(" | [%d] %-20s : %2d잔  %7s |\n", s, coffeeName, orderCount, pay));
            s++; // 리스트 인덱스 증가
        }
        message.append(" |                                                    |\n ")
                .append("+----------------------------------------------------+ \n")
                .append(" ============ 총 결제 금액은 " + f.format(totalMoney) + "입니다 ========== \n");
        System.out.println(message);
        payment(totalMoney);
    }

    private void payment(int totalMoney) {
        System.out.println("\n 결제를 진행하기 위해 카드를 넣어주세요.");
        int payResult = customer.getMoney() - totalMoney;
        try {
            System.out.println("\n결제 중입니다.");
            t.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (payResult < 0) {
            System.out.println("잔액이 부족합니다.");
        } else {
            customer.setMoney(payResult);
            System.out.println("결제가 완료되었습니다.");
            System.out.println("이용해 주셔서 감사합니다.");
            orderNum++;
        }
    }

    private void order() {
        try {
            System.out.println("\n 취소를 원하시면 0번을 누르세요.");
            end: while (true) {
                System.out.println("\n 원하는 음료의 번호를 선택해주세요.");
                String choice = sc.next();
                int choiceNum = Integer.parseInt(choice.substring(0, 1));
                if (choiceNum == 0) {
                    System.out.println("주문을 취소합니다.");
                    System.exit(0);
                }
                sc.nextLine();

                String coffeeName = coffee.coffeeList.get(choiceNum - 1);
                System.out.println("선택하신 음료는 " + coffeeName + "입니다. 수량을 입력해주세요.");
                int orderCount = sc.nextInt();
                sc.nextLine();

                if (reOrder) {
                    for (String coff : orderList.keySet()) {
                        if (coff.equals(coffeeName)) {
                            int addCount = orderList.get(coff).intValue() + orderCount;
                            orderList.replace(coffeeName, addCount);
                        } else {
                            orderList.put(coffeeName, orderCount);
                            break;
                        }
                    }
                } else {
                    orderList.put(coffeeName, orderCount);
                }
                customer.setCoffeeOrder(orderList);

                addOrder();
                break end;
            }
        } catch (Exception e) {
            System.out.println("잘못된 선택입니다.");
        }
    }

    private void addOrder() {
        reOrder = false;
        System.out.println("\n 주문을 계속 하시겠습니까?");
        System.out.println("예(Y)/아니오(N)");
        String yesOrno = sc.next();
        if (yesOrno.equals("예") || yesOrno.equalsIgnoreCase("y")) {
            coffee.getMenu();
            reOrder = true;
            order();
        } else if (yesOrno.equals("아니오") || yesOrno.equalsIgnoreCase("n")) {
            return;
        }
    }
}
