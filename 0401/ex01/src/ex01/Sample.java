package ex01;


import hyndai.*;
import hankook.*;	//한국패키지의 모든 클래스를 이용
import kumho.*;

public class Sample {

	public static void main(String[] args) {
		hankook.Tire t=new hankook.Tire();		//한국일반타이어>> Tire 클래스가 두개이므로 클래스 이름을 명시함.
		kumho.Tire t1=new kumho.Tire();			//금호일반타이어
		Engine e=new Engine();
		BigWidthTire t2=new BigWidthTire();
	}

}
