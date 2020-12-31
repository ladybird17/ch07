package ch07;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student("홍길동","123456-7890123",1);
		System.out.printf("name : %s\n",student.name);
		System.out.printf("ssn : %s\n",student.ssn);
		System.out.printf("studentNo : %s\n",student.studentNo);
	}

}
