package ex02;

public class Car {
//1.�ʵ弱���ϱ�----------------------------------------------------------
	private String company; //�ٸ������� �����Ұ��ϹǷ� private
	private int maxSpeed;

//***�ʵ尡 private���� ����Ǹ� set, get�޼ҵ带 �����ؾ� �Ѵ�.***
	
//4.set() �޼���---------------------------------------------------------
	public void setcompany(String company) {
		this.company=company;
	}
	
//4-1.get() �޼���---------------------------------------------------------
	public String getCompany() {
		return company;
	}
	
//2.�⺻������(�⺻)-------------------------------------------------------
	Car(){
	
	}
}
