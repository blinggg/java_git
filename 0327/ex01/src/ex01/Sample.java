package ex01;

import java.util.Scanner;

public class Sample {
		
	public static void main(String[] args) {
		//1����-> ���ʿ���
		// ���������ϱ�
		int a=6;
		int b=15;
		
		String name1="������";
		String name2="������";
		String name3=new String("������");
		
		
		//������.
		//1.���������(+,-,*,/,%)
		
		//2.�񱳿�����(<,>,<=,>=,==,!==)>> ������������� �񱳴� == / �� �񱳴� equal
		
		//3.��������(!, && , |)
		//if�� Ȱ��========================================================================
			boolean isrun;
			
			isrun=(a>=5) && (b<10);			//isrun���� ���� ���� ������ �ǹǷ�

			if(isrun) {						//while���� ���� ���ǽĿ� 'isrun'�� �Է��Ѵ�.
				System.out.println("��");
			}else {
				System.out.println("����");
			}
			
		//equals�� ������ �� ���ϱ�.===========================================================
			if(name1.equals(name3)) {
				System.out.println("�����ϴ�");
			}else {
				System.out.println("�����ʽ��ϴ�.");
			}
			
			if(a==b) {
				System.out.println("����?");
			}else {
				System.out.println("�ٸ���?");
			}
		
		//2���� ���ǹ�=======================================================================
		int score=95;
		
		//������ 90���̻��̸� A���
		//������ 80���̻��̸� B���
		//������ 70���̻��̸� C���
		//������ 70���̸��̸� F���
		//if~else if~else�� ���
		
		//100~95�� �����̸� A+
		//94~90�� �����̸� A0
		if(score<=100 && score>=95) {
			System.out.println("A+�Դϴ�.");
		}else if(score<95 && score>=90) {
			System.out.println("A0�Դϴ�");
		}else if(score>=80) {
			System.out.println("B�Դϴ�");
		}else if(score>=70) {
			System.out.println("C�Դϴ�.");
			
		}else {System.out.println("F�Դϴ�.");
		
		}
		
		//�ݺ���
		int sum=0;
		for(int i=1; i<=100; i++) { //i�� for�� �ȿ����� �� �� �ִ� ��������.
			sum=sum+i;
		}System.out.println("1���� 100������ �հ�>"+sum);
		
		sum=0;
		int i=1;
		while(i<=100) {
			sum=sum+i;
			i++;
		}System.out.println("100��������="+sum);
		
		//�迭
		int[] num= {1,2,3,4,5};
				
		for(int j=0; j<num.length; 
				j++) {
			System.out.println(num[j]);
			sum=sum+num[j];
		}
		System.out.println("�հ��:"+sum);
		System.out.println("�����:"+sum/(double)num.length);
		
		//�迭������ Ű���忡�� �Է¹޾Ƽ� �����ϱ�
		//=================================================================
	      	Scanner s=new Scanner(System.in);
	      	
			int[] number=null;					//�迭����
	      
	      System.out.print("�迭ũ��>");
	      int count=s.nextInt();				//�迭ũ�⸦ Ű���忡�� �Է�
	      number = new int[count];				//�迭����, == int[] number=new int[count];����
	      
	      sum=0;								//�հ躯�� �ʱ�ȭ
	      
	      for(int j=0; j<count; j++) {			//0~�迭ũ�⸸ŭ �ݺ�
	         System.out.print("��[" + j + "]>");
	         number[j]=s.nextInt();				//�Է°��� j��°�濡 ����
	         sum=sum+number[j];					//j��°���� sum�� ������Ű�� ��
	      }
	      System.out.println("�հ�=" + sum);
		
	}//main
}//class