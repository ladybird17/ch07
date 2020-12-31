package ch07_1;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		//각 클래스를 생성해서 객체를 만듬
		Vehicle v = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//Driver클래스의 멤버메서드 drive()는 원래 매개변수로 Vehicle 클래스의 객체를 받음
		driver.drive(v);
		//매개변수의 다형성을 통해서 Bus, Taxi 클래스(Vehicle을 상속받은 클래스)의 객체를 넣음
		driver.drive(bus);
		driver.drive(taxi);
	}

}
