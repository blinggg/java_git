package ex05;

public class Sample {

	public static void main(String[] args) {
		//배열함수
		
		String[] name={"심청이", "홍길동","강감찬"};
		int[] kor= {85,95,70};
		int[] eng= {90,87,70};
		int[] mat= {90,95,60};
		int[] tot= new int[3]; // 총합계를 구할 공간 3
		double[] avg=new double[3]; // 총평균을 구할 공간3
		
		int sumkor=0;          //국어점수 합계
		int sumeng=0;          //영어점수 합계
		int summat=0;          //수학점수 합계
		int sumtot=0;          //국어점수 합계
		double sumavg=0;       //평균의 합계
		
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균"); // \t tab
		for(int i=0; i<=2;i++) {
			tot[i]=kor[i]+eng[i]+mat[i]; //합계 구하는 식
			avg[i]=tot[i]/3.;            //평균=합계/3
			
		System.out.println
		(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]);
		
			sumkor=sumkor+kor[i];      	//국어점수의 합계
			sumeng=sumeng+eng[i];     	//영어점수의 합계
			summat=summat+mat[i];     	//수학점수의 합계
			sumtot=sumtot+tot[i];     	//총점의 합계
			sumavg=(int)sumavg+avg[i];	//평균의 합계
		}
			System.out.println("==================================================");
			System.out.println
			("반평균\t"+sumkor/3+"\t"+sumeng/3+"\t"+summat/3+"\t"+sumtot/3+"\t"+(int)sumavg/3.+"\t");
			
	}
	}

