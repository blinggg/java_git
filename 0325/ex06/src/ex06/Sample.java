package ex06;

public class Sample {

	public static void main(String[] args) {
		//
		String[] name= {"냉장고", "세탁기", "에어컨"};
		int[] amount= {2,3,5};
		int[] price= {300,100,150};
		int[] sum=new int[3]; //금액
		
		System.out.println("************매출보고서************");
		System.out.println("-----------------------------------");
		System.out.println("상품명\t수량\t단가\t금액\t비고");
		System.out.println("-----------------------------------");
		
		for(int i=0; i<=2; i++) {
			sum[i]=amount[i]*price[i];
		
		System.out.println(name[i]+"\t"+amount[i]+"\t"+price[i]+"\t"+sum[i]+"\t"+remark[i]);							}
		System.out.println("-----------------------------------");
		System.out.println("매출합계\t\t\t"+);
		System.out.println("-----------------------------------");
		
	
	}//m
}//class



