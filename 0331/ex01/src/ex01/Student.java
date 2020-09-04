package ex01;

public class Student {
		//필드
		//클래스가 가지는 속성:학번, 
		String sno;
		String sname;
		String tel;
		
	
	
		//기본생성자>> 생략가능 >> 객체생성자
	 	Student(){
	 		
	 	}
	 	
	 	//기본생성자가 아닌것(일반생성자)
	 	Student(String sno, String sname, String tel){
	 		this.sno=sno;
	 		this.sname=sname;
	 		this.tel=tel;
	 	}
	 		 	
	 	//메소드
	 	public void print(Student s) {
	 		System.out.println(" =====================");
	 		System.out.println("번호:"+s.sno);
	 		System.out.println("이름:"+s.sname);
	 		System.out.println("전화번호:"+s.tel);
	 	}//method
}
