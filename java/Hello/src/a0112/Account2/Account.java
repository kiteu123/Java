package Account2;

public class Account {
    String owner;
    int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int money) {
        balance += money;
        System.out.printf("[%s] %d원 입력 -> 잔액 %d원\n", owner, money, balance);
    }

    public boolean withdraw(int money) {
        if (balance < money) {
            System.out.printf("[%s] 출금 실패 (잔액 부족)", owner);
            return false;
        }

        balance -= money;
        System.out.printf("[%s] %d원 입력 -> 잔액 %d원\n", owner, money, balance);
        return true;
    }

    public boolean transfer(Account target, int money) {
        if (balance < money) {
            System.out.printf("(%s => %s) 송금 실패 (잔액 부족)\n", owner, target.owner);
            return false;
        }
        this.balance -= money;
        target.balance += money;
        System.out.printf("(%s => %s) %d 송금 성공\n", owner, target.owner, money);
        System.out.printf("[%s, 잔액 : %d원]\n", owner, balance);
        System.out.printf("[%s, 잔액 : %d원]\n", target.owner, target.balance);
        return true;
    }
}
