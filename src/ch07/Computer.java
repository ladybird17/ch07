package ch07;

public class Computer extends Calculator {
	
	//오버라이딩
	@Override //어노테이션 : 컴파일러에게 특정 작업을 수행한다고 알려주는 메시지
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI*r*r;
	}
	
	/*
	문제 3. Calculator 클래스를 상속받아 사칙연산을 하는 프로그램 작성
	조건1) Computer 클래스가 Calculator 클래스 상속받음
	조건2) 사칙 연산 메서드를 모두 override함
	조건3) Computer 클래스에는 화면에 결과를 프린트하기위한 printer()메서드 존재
	조건4) 오버라이딩한 메서드는 printer() 메서드를 사용하여 결과 출력
	조건5) printer() 메서드는 매개변수 2개 입력받고, 그중 1개를 이요하여 사칙연산중 어떤것인지
	판단하여 화면에 결과 출력
 	*/
	
	@Override
	public int plus(int x, int y) {
		int result = x+y;
		printer(result,'+');
		return result;
	}
	@Override
	public int minus(int x, int y) {
		int result = x-y;
		printer(result,'-');
		return result;
	}
	@Override
	public int multi(int x, int y) {
		int result = x*y;
		printer(result,'*');
		return result;
	}
	@Override
	public int division(int x, int y) {
		int result = x/y;
		printer(result,'/');
		return result;
	}
	
	public void printer(int result, char calKind) {
		switch(calKind){
		case '+':
			System.out.printf("두 수의 덧셈은 %d입니다. \n",result);
			break;
		case '-':
			System.out.printf("두 수의 뺄셈은 %d입니다. \n",result);
			break;
		case '*':
			System.out.printf("두 수의 곱셈은 %d입니다. \n",result);
			break;
		case '/':
			System.out.printf("두 수의 나눗셈은 %d입니다. \n",result);
			break;
		}
	}
}
