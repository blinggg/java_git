package ex03;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//주소관리예제
		
		Scanner s=new Scanner(System.in);	
		boolean run=true;
		
		//변수정하기
		String[] no=new String[100];			//
		String[] name=new String[100];
		String[] address=new String[100];
		int count = 0; 						
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.주소입력|2.주소목록|3.주소조회|4.종료");
			System.out.println("---------------------------------");
			
			System.out.print("선택>");
			int menu=s.nextInt();
			
			switch(menu) {
			
			case 1://주소입력
				
				System.out.println("------------------------------");
				System.out.println("주소입력");
				System.out.println("------------------------------");
				
				//1번입력시 나오는 상황
				System.out.print("번호>");					//0번방
				no[count]=s.next();
				System.out.print("성명>");					//0번방
				name[count]=s.next();
				
				//주소 입력시 띄어쓰기를 할 경우
				System.out.print("주소>");					//0번방
				s.nextLine();
				address[count]=s.nextLine(); 
				
											//1씩 증가
				System.out.println("결과:학생이 입력되었습니다.");
				count++;
				break;
				
			case 2://주소목록
				
				System.out.println("------------------------------");
				System.out.println("주소목록");
				System.out.println("------------------------------");
				
				for(int i=0; i<=count-1; i++) {
					System.out.println(no[i]+"\t"+name[i]+"\t"+address[i]);}
				break;
				
			case 3://주소조회
				System.out.println("------------------------------");
				System.out.println("주소조회");
				System.out.println("------------------------------");
				
				System.out.println("번호>");
				String number=s.next();
				
				for(int i=0; i<=count-1; i++) {
					if(no[i].equals(number)) {
						System.out.println("성명:"+name[i]);
						System.out.println("주소:"+address[i]);
					}
				}
				break;
				
			case 4://종료
				run=false;
				System.out.println("프로그램 종료");
				
				
			}//switch
		}//while
	}//main
}//class
