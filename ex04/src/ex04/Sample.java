package ex04;

public class Sample {

	public static void main(String[] args) {
		//자동형변환(작은것->큰것)
		char charValue='A';
		int intValue=charValue;
		System.out.println(intValue);
		
		//강제형변환(큰것->작은것)
		intValue=98;
		charValue=(char)intValue;
		System.out.println(charValue);
		
		int kor=95, eng=100;
		double avg=((double)kor+eng)/2;
		System.out.println(avg);
		
		double doubleValue=12.56789;
		intValue=(int)doubleValue;
		System.out.println(intValue);
		
		intValue=68;
		charValue=(char)intValue;
		System.out.println(charValue);
		
		//for 반복문
		for(char i='A'; i<='Z'; i++) {
			intValue = i;
			System.out.println(i + ":" + intValue );
			
			
			
		}
	}
}
