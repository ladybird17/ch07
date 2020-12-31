package ch07_1;

public class ChildMain {

	public static void main(String[] args) {

		Parents parents = new Parents();
		parents.field1 = "data1";
		parents.method1();
		parents.method2();
		
		Child child = new Child();
		child.field1 = "data2";
		child.field2 = "data3";
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("---------자동 타입 변환----------");
		
		parents = child;
		parents.method1();
		parents.method2();
		// parents 객체에 자손클래스타입의 객체 child를 대입하는것이 가능함(다형성, 자동타입변환)
//		parents.field2 = "child data2";
//		parents.method3();
		// 자손클래스타입의 객체를 부모클래스타입의 변수에 대입하면 자동 타입 변환이 발생하며,
		//부모클래스 타입이 가지고 있는 멤버만 사용 가능해짐
		
		System.out.println("---------강제 타입 변환----------");
		Child child2 = (Child)parents;
		child2.field2 = "child data2";
		child2.method3();
		//부모클래스타입에 저장된 객체가 원래 자손 객체였을 경우 강제타입변환을 통해
		//다시 자손 클래스 타입 객체로 변환 가능함
		//다시 자손 클래스 타입으로 변환된 객체는 자신의 멤버를 모두 사용 가능
	}

}
