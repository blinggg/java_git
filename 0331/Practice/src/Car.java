//1.클래스 생성하기
public class Car {
	
//2.필드 선언하기------------------------------------
	String companny="현대";
	String model;
	String color;
	int maxspeed;

//3.기본생성자--------------------------------------
	Car(){
		
	}
//5.메소드 출력---------------------------------------
	public void print(Car car) {
		System.out.println("---------------------------");
		System.out.println("회사:"+companny);
		System.out.println("모델:"+model);
		System.out.println("색깔:"+color);
		System.out.println("최고속도:"+maxspeed);
	}
}
