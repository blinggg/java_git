package ex02;

//계산기 클래스
public class Calculater {
	//필드
	int x;
	int y;
	
	//기본생성자(객체를 생성하는 역할)
	Calculater(){
		
				}//기본생성자

	//일반생성자
	Calculater(int x, int y){
		this.x=x; 	// >> 실행하지 않으면 0으로 출력
		this.y=y; 	// >> 실행하지 않으면 0으로 출력
				}
	//메서드(동작)
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double divide(int x , int y) {
		double result=x/y;
		return result;
	}
	
	double mult(int x, int y) {
		double result=x*y;
		return result;
		
	}//계산기
	
	int sub(int x, int y) {
		int result=x-y;
		return result;
}
	
	

}//class
