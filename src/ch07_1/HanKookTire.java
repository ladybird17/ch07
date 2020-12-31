package ch07_1;

public class HanKookTire extends Tire {
	
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
		/*
		부모클래스에서 기본생성자를 구현하지 않고 다른 생성자들만 사용했을 경우,
		super(매개변수,...)형식으로 부모클래스의 생성자를 직접 호출해야함
		*/
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.printf("%s HanKookTire 수명 : %d회 \n",location,(maxRotation-accumulatedRotation));
			return true;
		}
		else {
			System.out.printf("*** %s HanKookTire 펑크 ***\n",location);
			return false;
		}
	}
}
