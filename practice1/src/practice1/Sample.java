package practice1;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
			//성적예제01
		Scanner s=new Scanner(System.in); //키보드 입력할 수 있게
		boolean run=true;					//while 사용(조건)
		int[] scores=null;				//어떤 값이 올지모르므로 null값을 지정
		
		//타이틀 반복하기
		while(run) {
		
			System.out.println("--------------------------");
			System.out.println("1.학생수는|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			
			int num=s.nextInt();
			
		switch(num) {
			case 1:
				System.out.print("학생수는:");
				int count=s.nextInt(); 		//키보드에 입력할 수 있게
				scores=new int[count]; 	//학생수만큼 점수저장공간을 만들어줘.
				break;
				
			case 2:
				for(int i=0; i<=scores.length-1; i++) {	//
					System.out.print("점수["+i+"]>");
					scores[i]=s.nextInt(); //★
				}
				break;
				
			case 3:
				for(int i=0; i<=scores.length-1; i++) {
					System.out.println("점수["+i+"]>"+scores[i]);
				}
				break;
				
			case 4:
					int sum=0;		//초기값 0설정
					int max=0;		//〃
					
				for(int i=0; i<=scores.length-1; i++) {
					if(max<=scores[i]) {max=scores[i];}
					sum=sum+scores[i];
				}
					double avg=sum/scores.length; //평균값 구하기
					
					System.out.println("최고점수는"+max+"입니다.");
					System.out.println("평균점수는"+avg+"입니다.");
				break;
				
			case 5:
				run=false;
				System.out.println("프로그램 종료합니다.");
				break;
				
			}//switch	
		
		}//while

	}//main
	
}//class
