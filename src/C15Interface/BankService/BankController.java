package C15Interface.BankService;


import java.util.Scanner;

/**
 * 요구사항
 * 1) BankConttroler
 * 2) BankServcie 인터페이스
 * 3) BankCardService, BankKapaya
 * 4) BankAccount 엔티티
 */

public class BankController {
    public static void main(String[] args) {
        System.out.print("계좌번호 입력:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        BankAccount ba = new BankAccount(input);
        System.out.println("입력한 계좌번호 :" + ba.getAccount_number());

        while (true) {
            System.out.println("Card : 1, KaPay : 2");
            String pay_service = sc.next();
            if (pay_service.equals("1")) {
                BankService card_pay = new BankCardService();
                System.out.println("1: 입금, 2: 출금");
                String dr_or_wi = sc.next();
                if (dr_or_wi.equals("1")) {
                    System.out.print("입금 금액:");
                    int money = sc.nextInt();
                    card_pay.deposit(ba,money);
                } else if (dr_or_wi.equals("2")) {
                    System.out.print("출금 금액:");
                    int money = sc.nextInt();
                    card_pay.withdraw(ba,money);
                }
            } else if (pay_service.equals("2")) {
                BankService kapay = new BankKapayService();
                System.out.println("1: 입금, 2: 출금");
                String dr_or_wi = sc.next();
                if (dr_or_wi.equals("1")) {
                    System.out.print("입금 금액:");
                    int money = sc.nextInt();
                    kapay.deposit(ba,money);
                } else if (dr_or_wi.equals("2")) {
                    System.out.print("출금 금액:");
                    int money = sc.nextInt();
                    kapay.withdraw(ba,money);
                }
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

    }
}

class BankAccount {
    private int balance;
    private String account_number;
    BankAccount(String account_number) {
        this.account_number = account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public String getAccount_number() {
        return account_number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

}
