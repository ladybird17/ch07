package ch07;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television tv = new Television();
		
		tv.powerOn();
		tv.changeChannel(10);
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
		
		SmartTv stv = new SmartTv();
		
		//Television으로부터 상속받은 메소드
		stv.powerOn();
		stv.volumeUp();
		stv.volumeUp();
		stv.channelUp();
		stv.changeChannel(11);
		stv.turnOnInternet();
		stv.changeUrl("www.naver.com");
		stv.turnOffInternet();
		stv.turnOnYoutube();
		stv.turnOffYoutube();
		stv.powerOff();
		
		
		//문제1 실행
		System.out.println("----------문제1----------");
		
		IPTV iptv = new IPTV();
		
		iptv.changeVodChannel(5);
		iptv.vodChannelUp();
		iptv.vodChannelUp();
		iptv.vodChannelDown();
		
		//문제2 실행
		System.out.println("----------문제2----------");
		tv.powerOn();
		tv.changeChannel(16);
		tv.changeChannel(15);
		tv.channelUp();
		tv.changeChannel(0);
		tv.changeChannel(1);
		tv.channelDown();
		tv.volumeDown();
		tv.volume=25;
		tv.volumeUp();
	}

}
