package ch07;

public class B {
	public void method() {
		A a = new A(); //protected는 같은 패키지 내에서는 상속받지 않아도 사용 가능
		a.field = "value";
		a.method();
	}
}
