package C15Interface.BankService;

public class BankKapayService implements BankService{
    @Override
    public void deposit(BankAccount account, int money) {
        account.setBalance(account.getBalance() + money);
        System.out.println(account.getAccount_number()+"계좌에 Kapay로 입금 후 금액:"+account.getBalance());
    }


    @Override
    public void withdraw(BankAccount account, int money) {
        if (money > account.getBalance()) {
            System.out.println("입력하신 "+money+"원보다 잔액이 부족합니다.");
        } else {
            account.setBalance(account.getBalance() - money);
            System.out.println(account.getAccount_number()+"계좌에 Kapay로 출금 후 금액:"+account.getBalance());

        }
    }

}
