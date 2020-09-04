package ex01;

public class DmbPhone extends phone{
	//필드
	int channel;
	
	//기본생성자 (기본, 일반생성자가 중복되어있을 경우> 오버로딩, 매개변수가 달라야함)
	DmbPhone(){
		
	}
	
	//일반생성자
	DmbPhone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//메서드
	void turnOnDmb() {
		System.out.println(channel + "번 DMB 방송을 수신합니다.");
		
	}
	
	void changeChannelup(int channel) {
		System.out.println(channel+"번으로 바꿉니다.");
	}
	void turnOffdmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}




