package ch07;

//CellPhone 클래스 상속
public class DmbCellPhone extends CellPhone {
	//channel 변수 추가
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.printf("채널 %d번 DMB 방송 수신을 시작합니다. \n",channel);
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.printf("채널 %d번으로 바꿉니다.\n", channel);
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
