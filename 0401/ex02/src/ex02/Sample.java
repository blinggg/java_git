package ex02;

import java.io.ObjectInputStream.GetField;

public class Sample {

	public static void main(String[] args) {
//3.객체생성하기==============================================		
		Car c1=new Car();
		
//5.메소드실행하기====================================
		c1.setcompany("삼성");
		System.out.println("제조사:"+c1.getCompany());
		
	}

}

