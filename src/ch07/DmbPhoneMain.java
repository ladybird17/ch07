package ch07;

public class DmbPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("모델 : "+ dmbCellPhone.model);
		System.out.println("색상 : "+ dmbCellPhone.color);
		
		System.out.println("채널 : "+ dmbCellPhone.channel);
		
		//CellPhone 클래스에서 상속 받은 멤버 메서드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요? 저는 홍길동입니다.");
		dmbCellPhone.sendVoice("예 반갑습니다~");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 클래스의 자체 멤버 메서드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	
		//오버라이딩한 메소드 사용
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
