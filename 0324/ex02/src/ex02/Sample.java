package ex02;

public class Sample {

	public static void main(String[] args) {
		
		/*// 점수 구하기
		String name="홍길동";
		int kor = 90, eng=90, mat=90;
		int tot = (kor+eng+mat);
		double avg = (tot / 3);
		String grade=""; // 초기값은 공란으로
	
		if(avg>=90){
			if(avg>=95) {
				grade="A+";
		}else{
			grade="A";
		}
	}
	
		else if(avg>=80){
			if(avg>=85) {
				grade="B+";
			}else{grade="B";}
		}
			
		else if(avg>=70) {
			if(avg>=75) {
				grade="C+";
			}else {grade="C";
		}
	}
		
		else {
			grade="D";
	}
		
		
		
		//성적표 출력하기
		System.out.println("이름은"+name+"입니다.");
		System.out.println("국어점수는"+kor+"점");
		System.out.println("영어점수는"+eng+"점");
		System.out.println("수학점수는"+mat+"점");
		System.out.println("총점은"+tot+"점");
		System.out.println("평균은"+avg+"점");
		System.out.println("당신의 등급은"+grade+"입니다.");*/
		
		//변수명 정하기
		String name="홍길동";
		int kor=90;
		int eng=80;
		int mat=80;
		int tot=kor+eng+mat;
		int avg=tot/3;
		String grade="";
		
		if(avg>=90 && avg>=95) {
			grade="A+";}
		else if(avg<95 && avg>85) {
			grade="A";}	
		else if(avg>=80 && avg>=85) {
			grade="B+";}
		else if(avg<85 && avg<75) {
			grade="B";}
		else if(avg>=70 && avg>=75) {
			grade="C+";}
		else {
			grade="C";}
		
			System.out.println("당신의 등급은"+grade+"입니다.");
   }//Sample 
}//main
