package ex01;

import java.util.Scanner;

public class Sample {
		
	public static void main(String[] args) {
		//1교시-> 기초연습
		// 변수지정하기
		int a=6;
		int b=15;
		
		String name1="정은경";
		String name2="정은경";
		String name3=new String("정은경");
		
		
		//연산자.
		//1.산술연산자(+,-,*,/,%)
		
		//2.비교연산자(<,>,<=,>=,==,!==)>> 데이터저장장소 비교는 == / 값 비교는 equal
		
		//3.논리연산자(!, && , |)
		//if문 활용========================================================================
			boolean isrun;
			
			isrun=(a>=5) && (b<10);			//isrun은에 대한 값은 거짓이 되므로

			if(isrun) {						//while문과 같이 조건식에 'isrun'을 입력한다.
				System.out.println("참");
			}else {
				System.out.println("거짓");
			}
			
		//equals로 데이터 값 비교하기.===========================================================
			if(name1.equals(name3)) {
				System.out.println("같습니다");
			}else {
				System.out.println("같지않습니다.");
			}
			
			if(a==b) {
				System.out.println("같니?");
			}else {
				System.out.println("다르니?");
			}
		
		//2교시 조건문=======================================================================
		int score=95;
		
		//점수가 90점이상이면 A출력
		//점수가 80점이상이면 B출력
		//점수가 70점이상이면 C출력
		//점수가 70점미만이면 F출력
		//if~else if~else문 사용
		
		//100~95점 사이이면 A+
		//94~90점 사이이면 A0
		if(score<=100 && score>=95) {
			System.out.println("A+입니다.");
		}else if(score<95 && score>=90) {
			System.out.println("A0입니다");
		}else if(score>=80) {
			System.out.println("B입니다");
		}else if(score>=70) {
			System.out.println("C입니다.");
			
		}else {System.out.println("F입니다.");
		
		}
		
		//반복문
		int sum=0;
		for(int i=1; i<=100; i++) { //i는 for문 안에서만 쓸 수 있는 지역변수.
			sum=sum+i;
		}System.out.println("1부터 100까지의 합계>"+sum);
		
		sum=0;
		int i=1;
		while(i<=100) {
			sum=sum+i;
			i++;
		}System.out.println("100까지의합="+sum);
		
		//배열
		int[] num= {1,2,3,4,5};
				
		for(int j=0; j<num.length; 
				j++) {
			System.out.println(num[j]);
			sum=sum+num[j];
		}
		System.out.println("합계는:"+sum);
		System.out.println("평균은:"+sum/(double)num.length);
		
		//배열갯수를 키보드에서 입력받아서 생성하기
		//=================================================================
	      	Scanner s=new Scanner(System.in);
	      	
			int[] number=null;					//배열선언
	      
	      System.out.print("배열크기>");
	      int count=s.nextInt();				//배열크기를 키보드에서 입력
	      number = new int[count];				//배열생성, == int[] number=new int[count];동일
	      
	      sum=0;								//합계변수 초기화
	      
	      for(int j=0; j<count; j++) {			//0~배열크기만큼 반복
	         System.out.print("값[" + j + "]>");
	         number[j]=s.nextInt();				//입력값을 j번째방에 저장
	         sum=sum+number[j];					//j번째값을 sum에 누적시키는 것
	      }
	      System.out.println("합계=" + sum);
		
	}//main
}//class