package ch07_1;

//Child클래스는 Parents를 상속받아서 field1,2와 메소드1,2,3 사용가능
public class Child extends Parents {
	
	public String field2;
	
	public void method3() {
		System.out.println("child-method3()");
	}
}
