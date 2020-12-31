package ch07;

public class SupersonicAirplane extends Airplane {
	
	//static final을 사용하여 상수로 선언
	//클래스명.상수명 형태로 사용해야함
	//상수는 선언과 동시에 초기화 또는 static {} 코드블럭을 이용하여 초기화
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			super.fly();
		}
	}
}
