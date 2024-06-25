package speakerr;
//스피커 클래스 만들기
//스피커는 2개의 멤버 변수를 가진다
//volume, 스피커의 볼륨 / 외부에서 접근 자체가 불가능
//maker, 제조 회사 이름 / 어디서든 접근 가능
//스피커는 3개의 메서드를 가진다
//volumeUp, 스피커의 볼륨을 +1
//volumeDown, 스피커의 볼륨을 -1
//getVolume, 스피커의 현재 볼륨을 출력하는 메서드
//스피커는 생성이 되면 외부에서 제조사의 이름을 받아서 생성이 되며, 볼륨은 20으로 고정된 상태로 생성 된다
//운영 클래스에서 스피커 인스턴스를 생성하고, 각각의 메서드를 실행해 주세요

public class Speaker {
    private int volume;
    public String maker;

    Speaker(String maker) {
        this.volume = 20;
        this.maker = maker;
    }
    public void volumeUp() {
       this.volume++;
    }
    public void volumeDown() {
        this.volume--;
    }
    public void getVolume() {
        System.out.println("현재 볼륨은 : " + this.volume);
    }
}
