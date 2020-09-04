package ex01;

public class Sample {

	public static void main(String[] args) {
		//배열에 있는 데이터들에 대한 평균값과 최대값 구하기
		
		//1 변수선언하기
		int[] num= {-23,-60,-97,-65,-45,-32,-78,-54,-200};
		int sum=0;
		int max=-10000; //초기값은 제일 큰 변수로 지정한다. 
		int min=10000;
		
		//2. for 반복문을 통하여 합계구하기, 최대값 구하기
			for(int i=0; i<=8; i++) {
				sum=sum+num[i]; 
				if(num[i]>max) {max=num[i];}
				if(num[i]<min) {min=num[i];}
									}//for
		//3. 평균값과 최대값 출력하기
			double avg=(double)sum/num.length;     // int=>double강제형 변환
			System.out.println("평균값은"+avg+"입니다.");
			System.out.println("최대값은"+max+"입니다.");
			System.out.println("최소값은"+min+"입니다.");
	}//main
}//class
