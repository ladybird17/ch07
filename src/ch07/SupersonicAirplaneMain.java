package ch07;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane air1 = new SupersonicAirplane();
		air1.fly();
		air1.flyMode = air1.SUPERSONIC;
		air1.fly();
	}

}
