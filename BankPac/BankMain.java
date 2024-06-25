package BankPac;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank("김연비",1000,"국민은행");
        System.out.println(bank.name);
        System.out.println(bank.balance);

    }
}
