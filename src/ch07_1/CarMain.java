package ch07_1;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		for(int i = 1; i<=7; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HanKookTire로 교체");
				//다형성.
				car.frontLeftTire = new HanKookTire("앞 왼쪽",15);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				//다형성. 이렇게 사용하면 소스가 더 깔끔해진다.
				car.frontRightTire = new KumhoTire("앞 오른쪽",13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HanKookTire로 교체");
				car.backLeftTire = new HanKookTire("뒤 왼쪽",14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽",17);
				break;
			}
			
			System.out.println("--------------------------------");
		}
	}

}
