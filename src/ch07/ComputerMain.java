package ch07;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		Calculator cal = new Calculator();
		System.out.println("원 면적 : "+cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원 면적 : "+com.areaCircle(r));
		
		Computer com2 = new Computer();
		com2.plus(10,5);
		com2.minus(10,5);
		com2.multi(10,5);
		com2.division(10,5);
	}

}
