package ex01;

public class Car {
	//car1�ʵ�--------------------------------------------------------------
	String company="����";
	String model;     	//����
	String color;		
	int maxSpeed;
	
	//�⺻������---------------------------------------------------------
	Car(){
	
	}
	
	//�Ϲݻ�����--------------------------------------------------------------
	Car(String company, String model, String color, int maxSpeed){
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

	//��¸޼ҵ� (����)---------------------------------------------------------
	void printCar(Car car) {
		System.out.println("-----�ڵ��� ����-----");
		System.out.println("ȸ��:"+car.company);
		System.out.println("��:"+car.model);
		System.out.println("�ִ�ӵ�:"+car.maxSpeed);
		
		System.out.println("");
	}
	
	
	
}//c
