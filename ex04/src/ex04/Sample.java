package ex04;

public class Sample {

	public static void main(String[] args) {
		//�ڵ�����ȯ(������->ū��)
		char charValue='A';
		int intValue=charValue;
		System.out.println(intValue);
		
		//��������ȯ(ū��->������)
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
		
		//for �ݺ���
		for(char i='A'; i<='Z'; i++) {
			intValue = i;
			System.out.println(i + ":" + intValue );
			
			
			
		}
	}
}
