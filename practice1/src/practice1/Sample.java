package practice1;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
			//��������01
		Scanner s=new Scanner(System.in); //Ű���� �Է��� �� �ְ�
		boolean run=true;					//while ���(����)
		int[] scores=null;				//� ���� �����𸣹Ƿ� null���� ����
		
		//Ÿ��Ʋ �ݺ��ϱ�
		while(run) {
		
			System.out.println("--------------------------");
			System.out.println("1.�л�����|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("--------------------------");
			System.out.print("����>");
			
			int num=s.nextInt();
			
		switch(num) {
			case 1:
				System.out.print("�л�����:");
				int count=s.nextInt(); 		//Ű���忡 �Է��� �� �ְ�
				scores=new int[count]; 	//�л�����ŭ ������������� �������.
				break;
				
			case 2:
				for(int i=0; i<=scores.length-1; i++) {	//
					System.out.print("����["+i+"]>");
					scores[i]=s.nextInt(); //��
				}
				break;
				
			case 3:
				for(int i=0; i<=scores.length-1; i++) {
					System.out.println("����["+i+"]>"+scores[i]);
				}
				break;
				
			case 4:
					int sum=0;		//�ʱⰪ 0����
					int max=0;		//��
					
				for(int i=0; i<=scores.length-1; i++) {
					if(max<=scores[i]) {max=scores[i];}
					sum=sum+scores[i];
				}
					double avg=sum/scores.length; //��հ� ���ϱ�
					
					System.out.println("�ְ�������"+max+"�Դϴ�.");
					System.out.println("���������"+avg+"�Դϴ�.");
				break;
				
			case 5:
				run=false;
				System.out.println("���α׷� �����մϴ�.");
				break;
				
			}//switch	
		
		}//while

	}//main
	
}//class
