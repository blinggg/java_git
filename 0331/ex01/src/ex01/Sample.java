package ex01;

public class Sample {

	public static void main(String[] args) {
		//0331 클래스, 메소드 구분하기
		
		
		Student s3=new Student("03","이몽룡","010-1111-7777");
		s3.print(s3);
		
		//일반생성자를 쓰려면 기본생성자도 생략하면 안된다.
		
		Car car3=new Car("삼성","슈퍼","회색",300);
		car3.printCar(car3);
				
	}//m
}//c
