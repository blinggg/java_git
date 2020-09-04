package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		boolean run=true;
		ArrayList<Report> array=new ArrayList<Report>();
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.성적입력|2.성적조회|3.성적표|4.프로그램종료");		
			System.out.println("-----------------------------------------");
			System.out.println("메뉴입력>");
			int menu=s.nextInt();

		switch(menu) {
			case 1:
				Report r=new Report();
				System.out.print("번호>");
				r.setSno(s.next());
				System.out.print("이름");
				r.setSname(s.next());
				System.out.print("국어");
				r.setKor(s.nextInt());
				System.out.print("영어");
				r.setEng(s.nextInt());
				System.out.print("수학");
				r.setMat(s.nextInt());
				array.add(r);			//★ r값을 array에 저장>> 누락하면 데이터 저장x
				System.out.println("입력완료!");
				break;
				
			case 2:
				System.out.println("조회할번호:");
				boolean find=false;
				String no=s.next();
				for(int i=0; i<array.size(); i++){
					r=array.get(i);
					
					if(no.equals(r.getSno())) {
						r.printReport();
						find=true;
					}
				}
				if(find==false) {
					System.out.println("조회할 번호가 없습니다.");
				}
				
				break;
				
			case 3:
				for(int i=0; i<array.size(); i++) {
					r=array.get(i);
					r.printList();}
				break;
				
			case 4:
				run=false;
				System.out.println("프로그램종료");
				break;
			
			
			}//s
		}//w
	}

}
