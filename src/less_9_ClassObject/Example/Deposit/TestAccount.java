package less_9_ClassObject.Example.Deposit;

/**
 * TheSusanin
 * 01 март 2021
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.insert(832345, "Nurik", 1000);
        account.display();
        account.checkBalance();
        account.deposit(40000);
        account.checkBalance();
        account.withdraw(15000);
        account.checkBalance();
    }
}
