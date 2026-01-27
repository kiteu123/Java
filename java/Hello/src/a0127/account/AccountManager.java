package a0127.account;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
    private ArrayList<Account> accounts;
    private String filename = "c:/Users/TJ/memo/account.txt";

    public AccountManager() {
        accounts = new ArrayList<>();
    }

    private void ensureDirectory() {
        File file = new File(filename);
        File dir = file.getParentFile();
        if (dir != null && !dir.exists()) {
            dir.mkdirs();
        }
    }

    private Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    private void createAccount(String number, String owner, int balance) {
        if (findAccount(number) != null) {
            System.out.println("이미 존재하는 계좌번호입니다.");
            return;
        }
        accounts.add(new Account(number, owner, balance));
        System.out.println("계좌가 생성되었습니다.");
    }

    private void deposit(String number, int amount) {
        Account acc = findAccount(number);
        if (acc == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return;
        }
        acc.deposit(amount);
        System.out.println("입금 완료! 현재 잔액: " + acc.getBalance() + "원");
        saveToFile();
    }

    private void withdraw(String number, int amount) {
        Account acc = findAccount(number);
        if (acc == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return;
        }
        if (!acc.withdraw(amount)) {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + acc.getBalance() + "원");
            return;
        }
        System.out.println("출금 완료! 현재 잔액: " + acc.getBalance() + "원");
        saveToFile();
    }

    private void printAccount(String number) {
        Account acc = findAccount(number);
        if (acc == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return;
        }
        System.out.println("=== 계좌 정보 ===");
        System.out.println(acc);
    }

    private void printAll() {
        if (accounts.isEmpty()) {
            System.out.println("등록된 계좌가 없습니다.");
            return;
        }
        System.out.println("=== 전체 계좌 목록 ===");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + ". " + accounts.get(i));
        }
    }

    private void deleteAccount(String number) {
        Account acc = findAccount(number);
        if (acc == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return;
        }
        accounts.remove(acc);
        System.out.println("계좌가 삭제되었습니다.");
        saveToFile();
    }

    private void saveToFile() {
        ensureDirectory();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Account acc : accounts) {
                bw.write(acc.toFileString());
                bw.newLine();
            }
            System.out.println("파일 저장 완료: " + filename);
        } catch (IOException e) {
            System.out.println("파일 저장 오류");
        }
    }

    private void loadFromFile() {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("파일이 없습니다. 새로 시작합니다.");
            return;
        }

        accounts.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                Account acc = Account.fromFileString(line);
                if (acc != null) {
                    accounts.add(acc);
                }
            }
            System.out.println("파일 불러오기 완료!");
        } catch (IOException e) {
            System.out.println("파일 읽기 오류");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountManager manager = new AccountManager();

        while (true) {
            System.out.println("\n=== 은행 계좌 관리 시스템 ===");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 계좌 조회");
            System.out.println("5. 전체 계좌 조회");
            System.out.println("6. 계좌 삭제");
            System.out.println("7. 파일 저장");
            System.out.println("8. 파일 불러오기");
            System.out.println("9. 종료");
            System.out.print("선택 > ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("계좌번호 입력: ");
                    String num = sc.nextLine();
                    System.out.print("예금주명 입력: ");
                    String owner = sc.nextLine();
                    System.out.print("초기 잔액 입력: ");
                    int bal = sc.nextInt();
                    manager.createAccount(num, owner, bal);
                    break;

                case 2:
                    System.out.print("계좌번호 입력: ");
                    String depNum = sc.nextLine();
                    System.out.print("입금할 금액 입력: ");
                    int depAmount = sc.nextInt();
                    sc.nextLine();
                    manager.deposit(depNum, depAmount);
                    break;

                case 3:
                    System.out.print("계좌번호 입력: ");
                    String withNum = sc.nextLine();
                    System.out.print("출금할 금액 입력: ");
                    int withAmount = sc.nextInt();
                    sc.nextLine();
                    manager.withdraw(withNum, withAmount);
                    break;

                case 4:
                    System.out.print("계좌번호 입력: ");
                    manager.printAccount(sc.nextLine());
                    break;

                case 5:
                    manager.printAll();
                    break;

                case 6:
                    System.out.print("계좌번호 입력: ");
                    manager.deleteAccount(sc.nextLine());
                    break;

                case 7:
                    manager.saveToFile();
                    break;

                case 8:
                    manager.loadFromFile();
                    break;

                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
