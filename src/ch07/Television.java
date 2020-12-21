package ch07;

public class Television {
	
	int channel;
	int volume;
	private int minCh = 1;
	private int maxCh = 15;
	private int minVol = 0;
	private int maxVol = 25;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	/*
	문제 2. Television 클래스는 현재 volume이 최대,최소가 존재하지 않는 상태이며,
	channel도 최소,최대가 존재하지 않는다. volume은 0~25까지로 수정하고,
	channel은 1~15까지로 수정. if else문
	 */
	
	//채널범위
	void rangeChannel(int channel) {
		if (channel<minCh) {
			this.channel = maxCh;
		}
		else if(channel>maxCh) {
			this.channel = minCh;
		}
		else {
			this.channel = channel;
		}
	}
	
	void changeChannel(int channel) {
		rangeChannel(channel);
		System.out.printf("%d번 채널로 변경합니다.\n",this.channel);
	}
	
	void channelUp() {
		channel++;
		rangeChannel(channel);
		System.out.printf("%d번 채널로 변경합니다.\n",this.channel);
	}
	
	void channelDown() {
		channel--;
		rangeChannel(channel);
		System.out.printf("%d번 채널로 변경합니다.\n",this.channel);
	}
	
	//볼륨범위
	void rangeVolume(int volume) {
		if (volume<minVol) {
			this.volume = minVol;
		}
		else if(volume>maxVol) {
			this.volume = maxVol;
		}
		else {
			this.volume = volume;
		}
	}
	
	void volumeUp() {
		volume++;
		rangeVolume(volume);
		System.out.printf("볼륨을 1 올립니다.\n 현재 볼륨은 %d \n",this.volume);
	}
	
	void volumeDown() {
		volume--;
		rangeVolume(volume);
		System.out.printf("볼륨을 1 내립니다.\n 현재 볼륨은 %d \n",this.volume);
	}
}
