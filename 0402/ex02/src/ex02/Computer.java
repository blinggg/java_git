package ex02;

public class Computer extends Calculater {

	@Override //상속받은 메서드를 재정의
	double areaCircle() {
		return r*r*3.14159;
	}
}
