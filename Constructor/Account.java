package Constructor;

public class Account {
    private int balance;
    // '접근제어자'가 필요! 다른 클래스에서 오류가 뜸

    String name;
    public String bankName;

    //int balance;


    Account(int balance, String name, String bankName){
        this.balance = balance;
        this.name = name;
        this.bankName = bankName;
    }
    void getBalance(){
        System.out.println("현재 잔고는 : " + this.balance);
    }
}
