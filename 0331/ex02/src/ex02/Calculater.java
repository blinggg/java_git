package ex02;

//���� Ŭ����
public class Calculater {
	//�ʵ�
	int x;
	int y;
	
	//�⺻������(��ü�� �����ϴ� ����)
	Calculater(){
		
				}//�⺻������

	//�Ϲݻ�����
	Calculater(int x, int y){
		this.x=x; 	// >> �������� ������ 0���� ���
		this.y=y; 	// >> �������� ������ 0���� ���
				}
	//�޼���(����)
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double divide(int x , int y) {
		double result=x/y;
		return result;
	}
	
	double mult(int x, int y) {
		double result=x*y;
		return result;
		
	}//����
	
	int sub(int x, int y) {
		int result=x-y;
		return result;
}
	
	

}//class
