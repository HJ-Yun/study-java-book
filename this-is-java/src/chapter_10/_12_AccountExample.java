package chapter_10;

public class _12_AccountExample {
    public static void main(String[] args) {
        _12_Account myAccount = new _12_Account();

        myAccount.deposit(10000);
        System.out.println("My Balance is " + myAccount.getBalance());

        try {
            myAccount.withdraw(30000);
        } catch (_12_BalanceException e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}
