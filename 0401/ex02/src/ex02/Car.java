package ex02;

public class Car {
//1.필드선언하기----------------------------------------------------------
	private String company; //다른곳에서 수정불가하므로 private
	private int maxSpeed;

//***필드가 private으로 선언되면 set, get메소드를 생성해야 한다.***
	
//4.set() 메서드---------------------------------------------------------
	public void setcompany(String company) {
		this.company=company;
	}
	
//4-1.get() 메서드---------------------------------------------------------
	public String getCompany() {
		return company;
	}
	
//2.기본생성자(기본)-------------------------------------------------------
	Car(){
	
	}
}
