package ex03;

public class Sample {

	public static void main(String[] args) {
		// 문자형 변수
		char a='A';
		String name="정은경";
		System.out.println("반:" + a);
		System.out.println("이름:" + name);
		int kor=85, eng=100, jap=95, com=100;
		double tot=kor + eng + jap + com;
		double avg=tot / 3;
		System.out.println("국어:" + kor);
		System.out.println("영어" + eng);
		System.out.println("일본어" + jap);
		System.out.println("컴퓨터" + com);
		System.out.println("총점은" + tot);
		System.out.println("평균은" + avg);
		
		//논리형 변수>>true or false
		boolean stop=false;
		System.out.println("stop:" + stop);
	}
}
