package Constructor;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1000,"김연비","국민은행");
        System.out.println(account.bankName);
        System.out.println(account.name);
        //System.out.println(account.balance);
    }
}
//스피커 클래스. 외부접근 불가능한 볼륨/ 어디서든 접근가능한 제조사
//볼륨업_다운메서드 만들기 볼륜은 20이 디폴트