package ex02;

public class Sample {

	public static void main(String[] args) {
		
		/*// ���� ���ϱ�
		String name="ȫ�浿";
		int kor = 90, eng=90, mat=90;
		int tot = (kor+eng+mat);
		double avg = (tot / 3);
		String grade=""; // �ʱⰪ�� ��������
	
		if(avg>=90){
			if(avg>=95) {
				grade="A+";
		}else{
			grade="A";
		}
	}
	
		else if(avg>=80){
			if(avg>=85) {
				grade="B+";
			}else{grade="B";}
		}
			
		else if(avg>=70) {
			if(avg>=75) {
				grade="C+";
			}else {grade="C";
		}
	}
		
		else {
			grade="D";
	}
		
		
		
		//����ǥ ����ϱ�
		System.out.println("�̸���"+name+"�Դϴ�.");
		System.out.println("����������"+kor+"��");
		System.out.println("����������"+eng+"��");
		System.out.println("����������"+mat+"��");
		System.out.println("������"+tot+"��");
		System.out.println("�����"+avg+"��");
		System.out.println("����� �����"+grade+"�Դϴ�.");*/
		
		//������ ���ϱ�
		String name="ȫ�浿";
		int kor=90;
		int eng=80;
		int mat=80;
		int tot=kor+eng+mat;
		int avg=tot/3;
		String grade="";
		
		if(avg>=90 && avg>=95) {
			grade="A+";}
		else if(avg<95 && avg>85) {
			grade="A";}	
		else if(avg>=80 && avg>=85) {
			grade="B+";}
		else if(avg<85 && avg<75) {
			grade="B";}
		else if(avg>=70 && avg>=75) {
			grade="C+";}
		else {
			grade="C";}
		
			System.out.println("����� �����"+grade+"�Դϴ�.");
   }//Sample 
}//main
