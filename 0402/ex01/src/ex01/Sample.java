package ex01;

public class Sample {

	public static void main(String[] args) {
		phone p1=new phone();
		p1.powerOn();
		p1.sendVoice("여보세요 나야~ 거기 잘 지내니~");
		p1.reciveVoice("저는 정아무개입니다.");
		p1.hangup();
		p1.powerOff();
		
		DmbPhone d1=new DmbPhone("삼성노트", "흰색",11);
		d1.powerOn();
		d1.turnOnDmb();
		d1.changeChannelup(9);
		d1.
		turnOffdmb();
	}
}
