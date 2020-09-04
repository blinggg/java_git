package practice2;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// 예제3. 주소관리 창 만들기
		Scanner s=new Scanner(System.in);
		boolean run=true;
		
		//변수정하기
		String[] num=new String[100]; //입력값은 숫자이지만 유일성을 가지기에 문자로 취급한다.
		String[] name=new String[100];
		String[] address=new String[100];
		int count=0;
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.주소입력|2.주소목록|3.주소조회|4.종료");
			System.out.println("----------------------------------");
			
			System.out.println("선택>");
			int menu=s.nextInt();
		
			switch(menu) {
			
			case 1 ://주소입력
				System.out.println("----------------------------------");
				System.out.println("주소입력");
				System.out.println("----------------------------------");
				
				System.out.print("번호>");
				num[count]=s.next();
				System.out.print("성명>");
				name[count]=s.next();
				
				//주소 입력시 띄어쓰기를 할 경우
				System.out.print("주소>");
				s.nextLine();				//띄어쓰기를 위한 한번 더 지정하기! 그냥 외워 
				address[count]=s.nextLine(); //★띄어쓰기
				
				System.out.println("결과:학생이 입력되었습니다.");
				
				count=count++;
				
				break;
				
			case 2 ://주소목록
				System.out.println("----------------------------------");
				System.out.println("주소목록");
				System.out.println("----------------------------------");
				
				for(int i=0; i<=count-1; i++) {
					System.out.println(num[i]+"\t"+name[i]+"\t"+address[i]);
				}//for
				break;
				
			case 3 ://주소조회
				System.out.println("----------------------------------");
				System.out.println("주소조회");
				System.out.println("----------------------------------");
				
				System.out.print("번호>");
				num[count]=s.next();
				
				for(int i=0; i<=count-1; i++) {
					if(num.equals(num[i])) {
						System.out.print("성명:"+name[i]);
						System.out.print("주소:"+address[i]);
					}
				
				}//for
				
				
				break;
				
			case 4 :
				run=false;
				System.out.println("프로그램 종료합니다.");
				break;
				
			
			}//switch
		}//while
	}//main
}//class
