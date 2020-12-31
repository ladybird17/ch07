package ch07;

public class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle 실행");
		return Math.PI*r*r;
	}
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x+y;
	}
	public int multi(int x, int y) {
		return x*y;
	}
	public int division(int x, int y) {
		return x/y;
	}

}
