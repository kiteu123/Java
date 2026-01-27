package a0127.account;

public class Account {
    private String accountNumber;
    private String ownerName;
    private int balance;

    public Account(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public String toFileString() {
        return accountNumber + "|" + ownerName + "|" + balance;
    }

    public static Account fromFileString(String line) {
        try {
            String[] parts = line.split("\\|");
            String accountNumber = parts[0];
            String ownerName = parts[1];
            int balance = Integer.parseInt(parts[2]);
            return new Account(accountNumber, ownerName, balance);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "계좌번호: " + accountNumber +
                ", 예금주: " + ownerName +
                ", 잔액: " + balance + "원";
    }
}
