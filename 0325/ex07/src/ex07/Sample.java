package ex07;

public class Sample {

	public static void main(String[] args) {
		// ���⺸��
		//1.�������ϱ�
		
		String[] name= {"�����","��Ź��","������"};
		int[] amount= {2,3,5};
		int[] price= {300,100,150};
		int[] sum=new int[3];        //�ݾ�
		String[] remark=new String[3];
		int total=0;

		//2.���� ����ϱ�
		System.out.println("**********���⺸��**********");
		System.out.println("=======================================");
		System.out.println("��ǰ��\t����\t�ܰ�\t�ݾ�\t���");
		
		for(int i=0; i<=2; i++) {
			sum[i]=amount[i]*price[i];
			if(sum[i]>=700) {
				remark[i]="�ֿ��";
			}else if(sum[i]>=500) {
				remark[i]="���";}
				else {
					remark[i]="����";
				}
			System.out.println(name[i]+"\t"+amount[i]+"\t"+price[i]+"\t"+sum[i]+"\t"+remark[i]);
			total=total+sum[i];	
			
		}//for��
		System.out.println("========================================");
		System.out.println("�����հ�\t\t\t"+total);
		System.out.println("========================================");
		
		}//main
		
	}//class

