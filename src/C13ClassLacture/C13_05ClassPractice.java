package C13ClassLacture;

public class C13_05ClassPractice {
    public static void main(String[] args) {
        BankAccount bank_1 = new BankAccount("219-3123421-123");
        System.out.println("계좌번호는 " + bank_1.getAccount_number());
        bank_1.deposit(1000000);
        bank_1.look_balance();
        bank_1.withdraw(500000);
        bank_1.look_balance();
        bank_1.withdraw(800000);
        bank_1.withdraw(500000);
        bank_1.look_balance();


    }
}
/** - 은행계좌 실습
 * 요구사항 )
 * 1) 객채변수 : 게좌번호 (account_number), 잔고 (balance)
 *  1-1) 계좌번호 setter
 * 2) 메서드 : 예금 (deposit), 인출 (withdraw)
 *  2-1) deposit에 잔액이 충분해야 인출 메서드
 *  2-2) 잔액이 얼마나 남았는지 확인하는 메서드
 */
class BankAccount {

    private String account_number;
    private int balance;
    BankAccount(String account_number) {
        this.account_number = account_number;
    }

//    생성자란 클래스 객체화 될때 자동으로 실행되는 메서드
//    클래스명(){}: 생성자의 형태
//    별도의 생성자를 만들지 않으면 매개변수가 없는 기본 생성자가 숨겨져있다.

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        if (money > this.balance) {
            System.out.println("입력하신 "+money+"원보다 잔액이 부족합니다.");
            look_balance();
        } else {
            this.balance = this.balance-money;
        }
    }

    public void look_balance() {
        System.out.println("현재 잔액은 " + this.balance + "원 입니다.");
    }

}
