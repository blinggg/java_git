
public class Student {


	//1.필드생성하기------------------------------------------------------
	String sno;
	String sname;
	String phon;

	//2.기본생성자-------------------------------------------------------
	Student(){
		
	}
	
	//4.메소드에서 출력구문 입력하기-------------------------------------------
	
	public void print(Student s1) {
		System.out.println(" =====================");
 		System.out.println("번호:"+s1.sno);
 		System.out.println("이름:"+s1.sname);
 		System.out.println("전화번호:"+s1.phon);
	
	}//m
}//c