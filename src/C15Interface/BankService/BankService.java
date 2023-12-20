package C15Interface.BankService;

public interface BankService {
    public void deposit(BankAccount account, int money);
    public void withdraw(BankAccount account, int money);
}
