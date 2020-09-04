
public class Sample {

	public static void main(String[] args) {
//5.Car 메소드 실행하기-------------------------------	
		Student();
	}	

		//3.Student 메소드 생성하기
	public static void Student() {
		
		Student s1=new Student(); //객체생성하기
		s1.sno="01";
		s1.sname="정은경";
		s1.phon="010-1111-2222";
		s1.print(s1);
		
		Student s2=new Student();
		
		s2.sno="02";
		s2.sname="이상희";
		s2.phon="010-2222-4444";
		s2.print(s2);
		
	}
//4.차량델관리 객체생성하기-------------------------------	
	public static void Car() {
		Car car1=new Car();
		car1.model="쿠퍼";
		car1.color="핑크";
		car1.maxspeed=200;
		car1.print(car1);
		
		Car car2=new Car();
		car2.model="람보르기니";
		car2.color="검정";
		car2.maxspeed=300;
		car2.print(car2);
	}
	
}
