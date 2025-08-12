package chapter_10;

public class _12_Account {
    private long balance;
    public _12_Account(){
    }
    public long getBalance(){
        return balance;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws _12_BalanceException{
        if (balance < money){
            throw new _12_BalanceException("Not enough money");
        }
        balance -= money;
    }
}
