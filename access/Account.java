package access;

public class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
    void getBalance(){
        System.out.println("현재 잔고는 : " + this.balance);
    }
}
