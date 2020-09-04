package ex05;

public class Sample {

	public static void main(String[] args) {
		// 산술연산자
		int num1=10;
		int num2=3;
		int result1= num1 + num2;
		int result2= num1 - num2;
		int result3= num1 * num2;
		int result4= num1 / num2;
		int result5= num1 % num2;
		
		//+, -, *, /, %(나머지) 연산결과 출력
		System.out.println(num1 + "+" + num2 + "=" + result1);
		System.out.println(num1 + "-" + num2 + "=" + result2);
		System.out.println(num1 + "*" + num2 + "=" + result3);
		System.out.println(num1 + "/" + num2 + "=" + result4);
		System.out.println(num1 + "%" + num2 + "=" + result5);

		//관계연산자(비교연산자)
		boolean result6 = (num1==num2);
		System.out.println(num1 + "==" + num2 + ":" + result6);
		result6 = (num1>num2);
		System.out.println(num1 + ">" + num2 + ":" + result6);
		result6 = (num1<num2);
		System.out.println(num1 + "<" + num2 + ":" + result6);
		result6 = (num1>=num2);
		System.out.println(num1 + ">=" + num2 + ":" + result6);
		result6 = (num1<=num2);
		System.out.println(num1 + "<=" + num2 + ":" + result6);
		result6 = (num1!=num2);
		System.out.println(num1 + "!=" + num2 + ":" + result6);
		
		//논리연산자 (and, or, not)
		result6=(num1>10) || (num2<5); //또는
		System.out.println("============");
		System.out.println(result6);
		
		result6=(num1>10) && (num2<5); // 그리고
		System.out.println(result6);
		
		//20세이상, 성별이 남자이면 입장가능 아니면 불가능 출력
		int age=23;
		char gender='M';
		
		if(age>=20 && gender=='M'){
			System.out.println("입장가능");
		}
		else {
			System.out.println("입장불가능");
		}
		
		//국어, 영어 점수가 각각 70점 이상이고
		//평균이 70점 이상이면 합격 아니면 불합격
		int kor=90, eng=100;
		double avg=(double) (kor + eng) / 2;
		
		if((kor>=70) && (eng>=70) && (avg>=70)) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		//삼항연산자>> 70점미만 불합격
		int grade=65;
		
		if(grade<70) {
			System.out.println("불합격");
		}else {System.out.println("합격");
	}
	
		String result =(grade<70) ? "불합격" : "합격";
		System.out.println(result);
		
		
		
		
		
		
		
		

		//단항 연산자>>grade=65
		System.out.println(++grade); // +1
		System.out.println(--grade); //-1
		
		//대입 연산자
		grade=60;
		System.out.println(grade);
		
		grade=grade+3; // grade+=3;
		System.out.println(grade);
		
		grade=grade-6; // grade-=3;
		System.out.println(grade);
		
	}
}
