package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Cal();
		
		System.out.println(Area.triangle(5, 5));
		System.out.println(Area.rectangle(10, 10));
		System.out.println(Area.rectangle(5));
		System.out.println(Area.circle(2));
	}
	
	public static void Cal() {
		Scanner s= new Scanner(System.in);
		System.out.print("x=");
		int x=s.nextInt();
		
		System.out.print("y=");
		int y=s.nextInt();
		
		
		Calculater c1=new Calculater(x,y);		//a.b�ž�.
		
		System.out.println("x:"+c1.x);
		System.out.println("y:"+c1.y);
		System.out.println("x+y:"+c1.plus(c1.x, c1.y));
		
		double result=c1.divide(c1.x, c1.y);
		System.out.println("x/y:"+result);
		System.out.print("x*y:"+result);
		System.out.print("x-y:"+result);
		
		
		
		}//
	}//m

