
public class Sample {

	public static void main(String[] args) {
//5.Car �޼ҵ� �����ϱ�-------------------------------	
		Student();
	}	

		//3.Student �޼ҵ� �����ϱ�
	public static void Student() {
		
		Student s1=new Student(); //��ü�����ϱ�
		s1.sno="01";
		s1.sname="������";
		s1.phon="010-1111-2222";
		s1.print(s1);
		
		Student s2=new Student();
		
		s2.sno="02";
		s2.sname="�̻���";
		s2.phon="010-2222-4444";
		s2.print(s2);
		
	}
//4.���������� ��ü�����ϱ�-------------------------------	
	public static void Car() {
		Car car1=new Car();
		car1.model="����";
		car1.color="��ũ";
		car1.maxspeed=200;
		car1.print(car1);
		
		Car car2=new Car();
		car2.model="���������";
		car2.color="����";
		car2.maxspeed=300;
		car2.print(car2);
	}
	
}
