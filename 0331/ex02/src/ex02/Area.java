package ex02;

//����
public class Area {
	//�ﰢ������:(�غ�*����)*2/1
	
	static double triangle(int x, int y) {
		System.out.print("�ﰢ���ǳ���");
		return x*y/2.;
				
	}
	
	//���簢�� ����:����*����
	 static int rectangle(int x, int y) {
		 System.out.print("���簢���ǳ���");
		 return x*y;
	 }
	 
	//���簢�� ����:����*����
	static int rectangle(int x) {
		System.out.print("���簢���ǳ���");
			 return x*x;
	}
	
	//���� ���� 
	static double circle(int r ) {
		System.out.print("���ǳ���");
			return r*r*3.14;
	}
}
