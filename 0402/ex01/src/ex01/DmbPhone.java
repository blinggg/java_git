package ex01;

public class DmbPhone extends phone{
	//�ʵ�
	int channel;
	
	//�⺻������ (�⺻, �Ϲݻ����ڰ� �ߺ��Ǿ����� ���> �����ε�, �Ű������� �޶����)
	DmbPhone(){
		
	}
	
	//�Ϲݻ�����
	DmbPhone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//�޼���
	void turnOnDmb() {
		System.out.println(channel + "�� DMB ����� �����մϴ�.");
		
	}
	
	void changeChannelup(int channel) {
		System.out.println(channel+"������ �ٲߴϴ�.");
	}
	void turnOffdmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}




