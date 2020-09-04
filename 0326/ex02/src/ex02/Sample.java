package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		boolean run=true;					//run이 true 일 때 까지 반복해.
		int[] scores=null;					//scores(점수입력) = null//★ 
		
		while(run) {
		
			//1.타이틀 정하기>>반복문사용>>5번누르면 종료
				System.out.println("-----------------------------------------");
				System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
				System.out.println("-----------------------------------------");
				
				System.out.print("선택>");
				int menu=s.nextInt();        //선택값을 입력 함.
			
			
			//switch조건문사용
				switch(menu) {
				
				case 1 :
					System.out.print("학생수>");
					int count=s.nextInt();		//학생수
					scores=new int[count];		//점수를 넣어줄 방 만들기>>학생수 만큼 생성되는 점수의 방
					break;	
					
				case 2 :
					for(int i=0; i<=scores.length-1; i++) { 
						System.out.print("점수["+i+"]>"); 
						scores[i]=s.nextInt(); //입력했던 점수 i번째를 입력해.
					}
					break;	
					
				case 3 :
					for(int i=0; i<=scores.length-1; i++) {
						System.out.println("점수["+i+"]>"+scores[i]);
					}
					break;
					
				case 4 :
						int sum=0;
						int max=0;
						
						
						for(int i=0; i<=scores.length-1; i++) {
						sum=sum+scores[i];
						
						if(max<scores[i]) {max=scores[i];}
						}
						
					double avg=sum/scores.length;
					
					System.out.println("최고점수:"+max);
					System.out.println("평균점수:"+avg);
					
					break;
					
				case 5 :
					run=false;
					System.out.println("프로그램이 종료되었습니다.");
					break;			//case 제일 마지막 구문은 break생략가능
					
			}//switch
		}//while
	}//main
}//class
