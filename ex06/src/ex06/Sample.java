package ex06;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//for1();
		//for2();
		//for3();
		//for4();
		System.out.println("1:100합계 2:짝수합계 3:홀수합계");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		switch(number) {
		case 1 :
			for2();
			break;
		case 2 :
			for3();
			break;
		case 3 : 
			for4();
		}
	}
	
	//0~100까지 짝수의 합 출력하기======================
	public static void for3() {
		System.out.println("***예제3***");
		int sum = 0;
		for(int i=0;i<=100 ;i=i+2) {
			sum=sum+i;
		}
		System.out.println("0~100까지의 짝수의 합은"+sum+"입니다.");
	}
	
	
	
	//1~100까지 홀수의 합 출력하기=====================
	public static void for4() {
		System.out.println("***예제4***");
		int sum=0; // 합의 저장공간
		for(int i=1; i<=100; i=i+2) { //i+=2
			sum=sum+i;
		}
		System.out.println("0~100까지의 홀수의 합은"+sum+"입니다.");
	}
	
	//1~100까지 합을 출력하기=========================
	public static void for2() {
		System.out.println("***예제2***");
			int sum = 0; // 합을 저장할 변수
			for (int i=1; i<=100; i++) {
				sum=sum+i;
				
			}
				System.out.println("1~100까지의 합계:"+sum);
	}
	
	//5까지 반복출력하기============================
	public static void for1(){
		System.out.println("***예제1***");
			for(int i=1; i<=10; i+=2){ // i=i+2
				System.out.println(i);
			}
	}
	
}
