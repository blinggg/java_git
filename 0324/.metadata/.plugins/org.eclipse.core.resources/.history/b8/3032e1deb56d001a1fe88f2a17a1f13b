package ex05;

import java.util.Scanner;

public class Sample {
	//main---------------------------------------------
	public static void main(String[] args) {
		//switch1(); //실행 할 메소드 이름을 적어준다
		//sunguk();
		sunguk1();
		
	}
	
	//학점구하기
	 public static void sunguk1() {
		 Scanner s=new Scanner(System.in); // 키보드입력
		 
		 System.out.print("점수>");
		 int score=s.nextInt();
		 if (score>=90) {
			 System.out.println("학점은 A");
		 }else if(score>=80) {
			 System.out.println("학점은 B");
		 }
	 }
     //sunguk---------------------------------------------
	public static void	sunguk() {
		System.out.println("****성적계산****");
		Scanner scanner=new Scanner(System.in); //키보드에서 값을 입력해보자
		
		System.out.print("국어>");
		int kor=scanner.nextInt();
		System.out.print("수학>");
		int mat=scanner.nextInt();
		System.out.print("영어>");
		int eng=scanner.nextInt();

		int total = kor + mat + eng ; 
		double avg = (double)total / 3;
		
		System.out.println("총점은"+total+"입니다.");
		System.out.println("평균은"+avg+"입니다.");
	
	}
	//switch1---------------------------------------------
	public static void switch1() {
		System.out.println("switch 예제1");
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("시간입력>");
		
		 int time=scanner.nextInt();
		 
		 switch(time) {
		 case 9:
			 System.out.println("회의를 합니다.");
			 break;
		 case 8 :
			 System.out.println("출근을 합니다.");
			 break;
		 case 10 :
			 System.out.println("업무를 봅니다.");
			 break;
		default :
			System.out.println("외근을 합니다.");
		 }
		 

	}
}
