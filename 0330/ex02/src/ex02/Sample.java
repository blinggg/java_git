package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//예제
		Scanner s=new Scanner(System.in);
		
		System.out.println("입력>");
		int ins=s.nextInt();
		
		for(int i=0; i<=ins; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		boolean run=true;
		
		while(run) {
			int menu=s.nextInt();
			
		switch(menu) {
			case 1:
			System.out.println("*");
				break;
				
			case 2:
				System.out.println("*");
				System.out.println("**");
				break;
				
			case 3:
				System.out.println("*");
				System.out.println("**");
				System.out.println("***");
				break;
				
			case 4:
				System.out.println("*");
				System.out.println("**");
				System.out.println("***");
				System.out.println("****");
				break;
				
			case 5:
				System.out.println("*");
				System.out.println("**");
				System.out.println("***");
				System.out.println("****");
				System.out.println("*****");
				}
			}
		}//main
}//class
