package ex03;

public class Sample {

	public static void main(String[] args) {
		// ������ ����
		char a='A';
		String name="������";
		System.out.println("��:" + a);
		System.out.println("�̸�:" + name);
		int kor=85, eng=100, jap=95, com=100;
		double tot=kor + eng + jap + com;
		double avg=tot / 3;
		System.out.println("����:" + kor);
		System.out.println("����" + eng);
		System.out.println("�Ϻ���" + jap);
		System.out.println("��ǻ��" + com);
		System.out.println("������" + tot);
		System.out.println("�����" + avg);
		
		//���� ����>>true or false
		boolean stop=false;
		System.out.println("stop:" + stop);
	}
}
