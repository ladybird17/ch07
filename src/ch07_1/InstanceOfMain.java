package ch07_1;

public class InstanceOfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents parentsA = new Child(); //자식타입
		method1(parentsA);
		method2(parentsA);
		
		Parents parentsB = new Parents();//부모타입
		method1(parentsB);
		method2(parentsB);
	}
	
	public static void method1(Parents parents) {
		if(parents instanceof Child) {
			Child child = (Child)parents;
			System.out.println("method1 - child로 변환 성공");
		}
		else {
			System.out.println("method1 - 변환되지 않음");
		}
	}
	
	public static void method2(Parents parents) {
		Child child = (Child)parents;
		System.out.println("method2 - child로 변환 성공");
	}

}
