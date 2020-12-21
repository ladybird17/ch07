package ch07;

public class IPTV extends Television {
	/*
	문제 1. Television 클래스를 상속받아 IPTV라는 클래스를 생성하고,
	IPTV 고유의 기능으로 VOD 채널을 볼수 있는 프로그램을 작성하세요.
	조건1) VOD 채널을 저장하는 멤버 변수 필요
	조건2) VOD 채널을 변경하는 메서드 필요
	*/
	
	int vodChannel;
	
	void changeVodChannel(int vodChannel) {
		this.vodChannel = vodChannel;
		System.out.printf("%d번 vod채널로 변경합니다.\n",this.vodChannel);
	}
	
	void vodChannelUp() {
		vodChannel++;
		System.out.printf("%d번 vod채널로 변경합니다.\n",this.vodChannel);
	}
	
	void vodChannelDown() {
		vodChannel--;
		System.out.printf("%d번 vod채널로 변경합니다.\n",this.vodChannel);
	}
}
