package ex03;

public class Sample {

	public static void main(String[] args) {
		//변수명 정하기 
		
		String name ="냉장고";
		int price=15; // 단가
		int number=5; // 수량
		int total=price*number; // 판매액=단가*수량
		String remark=""; // 비고
		
		if(total>=1000) {
			remark="최우수";}
		
		else if(total>=500){
				remark="우수";}
		
		else {remark="보통";}
	
		System.out.println("냉장고의 비고는 "+remark+"입니다.");
		System.out.println("냉장고의 총점은 "+total+"입니다.");
		
		//보기 쉽게 짜여진 프로그램이 좋은거야~
		//연산자를 이용한 if문도 사용가능하다.
		
		
	
	}
}
