package ex07;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		/*int i=0;
		int sum=0;
		
		//1~100까지의 합계
		while(i<100) {
			i=i+1; //i값을 1씩 증가시킨다.(i++, i+=1)
			sum=sum+i; // i값을 sum에 누적해.(sum+=i)
		}
		System.out.println("1~100까지의 합계:"+ sum);
		
		//0~100 짝수의 합계
		i=0;     //중복선언없이 값만 재설정함.
		sum=0;   //중복선언없이 값만 재설정함.
		
		while(i<100) {
			i=i+2;
			sum=sum+i;
		}
		System.out.println("1~100까지 짝수의 합계"+sum);
		
		//0~100 홀수의 합계
		i=1;
		sum=1;
		
		while(i<99) {
			i=i+2;
			sum=sum+i;
		}
		System.out.println("1~100까지 홀수의 합계"+sum)	;
		
		//0~100까지 홀수의 합계
		i=1;
		sum=0;
		
		while(i<100) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println("1~100까지 홀수의 합계"+sum)	;*/
		
		Scanner s=new Scanner(System.in);
	      System.out.print("숫자입력>");
	      int num=s.nextInt();
	      int sum=0;
	      
	      while(num!=0) {
	         for(int i=0; i<=num; i++) {
	            sum=sum+i;
	         }
	         System.out.println("1~" + num + "까지의 합계=" + sum + "\n");
	         sum=0;
	         System.out.print("숫자입력>");
	         num=s.nextInt();
	      }
	      
	      System.out.println("프로그램종료");
	   }
		
	}
	
