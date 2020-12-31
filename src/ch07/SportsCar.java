package ch07;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed = speed + 10;
	}
	
	
	//Car 클래스의 stop()메서드가 final을 사용해서 오버라이딩 불가능
//	@Override
//	public void stop() {
//		
//	}
}
