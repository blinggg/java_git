package ex05;

public class Sample {

	public static void main(String[] args) {
		// ���������
		int num1=10;
		int num2=3;
		int result1= num1 + num2;
		int result2= num1 - num2;
		int result3= num1 * num2;
		int result4= num1 / num2;
		int result5= num1 % num2;
		
		//+, -, *, /, %(������) ������ ���
		System.out.println(num1 + "+" + num2 + "=" + result1);
		System.out.println(num1 + "-" + num2 + "=" + result2);
		System.out.println(num1 + "*" + num2 + "=" + result3);
		System.out.println(num1 + "/" + num2 + "=" + result4);
		System.out.println(num1 + "%" + num2 + "=" + result5);

		//���迬����(�񱳿�����)
		boolean result6 = (num1==num2);
		System.out.println(num1 + "==" + num2 + ":" + result6);
		result6 = (num1>num2);
		System.out.println(num1 + ">" + num2 + ":" + result6);
		result6 = (num1<num2);
		System.out.println(num1 + "<" + num2 + ":" + result6);
		result6 = (num1>=num2);
		System.out.println(num1 + ">=" + num2 + ":" + result6);
		result6 = (num1<=num2);
		System.out.println(num1 + "<=" + num2 + ":" + result6);
		result6 = (num1!=num2);
		System.out.println(num1 + "!=" + num2 + ":" + result6);
		
		//�������� (and, or, not)
		result6=(num1>10) || (num2<5); //�Ǵ�
		System.out.println("============");
		System.out.println(result6);
		
		result6=(num1>10) && (num2<5); // �׸���
		System.out.println(result6);
		
		//20���̻�, ������ �����̸� ���尡�� �ƴϸ� �Ұ��� ���
		int age=23;
		char gender='M';
		
		if(age>=20 && gender=='M'){
			System.out.println("���尡��");
		}
		else {
			System.out.println("����Ұ���");
		}
		
		//����, ���� ������ ���� 70�� �̻��̰�
		//����� 70�� �̻��̸� �հ� �ƴϸ� ���հ�
		int kor=90, eng=100;
		double avg=(double) (kor + eng) / 2;
		
		if((kor>=70) && (eng>=70) && (avg>=70)) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
		
		//���׿�����>> 70���̸� ���հ�
		int grade=65;
		
		if(grade<70) {
			System.out.println("���հ�");
		}else {System.out.println("�հ�");
	}
	
		String result =(grade<70) ? "���հ�" : "�հ�";
		System.out.println(result);
		
		
		
		
		
		
		
		

		//���� ������>>grade=65
		System.out.println(++grade); // +1
		System.out.println(--grade); //-1
		
		//���� ������
		grade=60;
		System.out.println(grade);
		
		grade=grade+3; // grade+=3;
		System.out.println(grade);
		
		grade=grade-6; // grade-=3;
		System.out.println(grade);
		
	}
}
