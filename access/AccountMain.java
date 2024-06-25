package access;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(500);

        account.balance = -1000;

        account.getBalance();
    }
}
