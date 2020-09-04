package ex02;

public class Sample {

	public static void main(String[] args) {
		
		//실수형 변수
		double num1 = 10.5;
		double num2 = 20.3;
		double num3 = num1 + num2;
		double num4 = num1 - num2;
		double num5 = num1 * num2;
		double num6 = num1 / num2;
		System.out.println("두수더한결과=" + num3);
		System.out.println("두수뺀결과=" + num4);
		System.out.println("두수곱한결과=" + num5);
		System.out.println("두수나눈결과=" + num6);
		
		//반지름이 5인 원의 넓이
		int r = 5;
		double area = r * r * 3.14;
		System.out.println("반지름이 " + r + "인 원의 넓이=" + area);
	}

}
