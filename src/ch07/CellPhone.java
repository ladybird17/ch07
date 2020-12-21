package ch07;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() { //접근제한자 생략하면 default값 들어감
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 : "+ message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
