package ex01;

public class Sample {

	public static void main(String[] args) {
		//�迭�� �ִ� �����͵鿡 ���� ��հ��� �ִ밪 ���ϱ�
		
		//1 ���������ϱ�
		int[] num= {-23,-60,-97,-65,-45,-32,-78,-54,-200};
		int sum=0;
		int max=-10000; //�ʱⰪ�� ���� ū ������ �����Ѵ�. 
		int min=10000;
		
		//2. for �ݺ����� ���Ͽ� �հ豸�ϱ�, �ִ밪 ���ϱ�
			for(int i=0; i<=8; i++) {
				sum=sum+num[i]; 
				if(num[i]>max) {max=num[i];}
				if(num[i]<min) {min=num[i];}
									}//for
		//3. ��հ��� �ִ밪 ����ϱ�
			double avg=(double)sum/num.length;     // int=>double������ ��ȯ
			System.out.println("��հ���"+avg+"�Դϴ�.");
			System.out.println("�ִ밪��"+max+"�Դϴ�.");
			System.out.println("�ּҰ���"+min+"�Դϴ�.");
	}//main
}//class
