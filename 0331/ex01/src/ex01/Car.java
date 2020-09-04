package ex01;

public class Car {
	//car1필드--------------------------------------------------------------
	String company="현대";
	String model;     	//차종
	String color;		
	int maxSpeed;
	
	//기본생성자---------------------------------------------------------
	Car(){
	
	}
	
	//일반생성자--------------------------------------------------------------
	Car(String company, String model, String color, int maxSpeed){
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

	//출력메소드 (동작)---------------------------------------------------------
	void printCar(Car car) {
		System.out.println("-----자동자 정보-----");
		System.out.println("회사:"+car.company);
		System.out.println("모델:"+car.model);
		System.out.println("최대속도:"+car.maxSpeed);
		
		System.out.println("");
	}
	
	
	
}//c
