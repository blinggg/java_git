package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		while(run) {
		
		System.out.println("[1]1~100까지의 합계");
		System.out.println("[2]1~100까지의 짝수합계");
		System.out.println("[3]1~100까지의 홀수합계");
		System.out.println("[4]프로그램종료");
		
		Scanner s=new Scanner(System.in);
		System.out.println("메뉴 선택을 하세요!");
		int menu=s.nextInt();
		
		int sum=0;
	
		switch(menu) {
			case 1:
				System.out.print("\n***1~100까지의 합계");
				for(int i=1; i<=100; i++) {
					sum=sum+i;
				}
				System.out.println(sum);
				break;
				
			case 2:
				System.out.print("\n***1~100까지의 짝수합계");
				for(int i=0; i<=100; i+=2) {
					sum=sum+i;}
				System.out.println(sum);
				break;
				
			case 3:
				System.out.print("\n***1~100까지의 홀수합계");
				for(int i=1; i<=100; i+=2) {sum=sum+i;}
					System.out.println(sum);
				break;
				
			case 4:
					System.out.print("\n***프로그램종료!");
				
					run=false;
				break;
				
			default : 
				System.out.print("\n***잘못 입력했어요!");
					}
		}
		
	}//main
}//class
