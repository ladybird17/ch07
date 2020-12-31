package ch07_1;

import ch07.A;

public class D extends A{ //protected는 다른 패키지라도 상속받으면 사용 가능
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
