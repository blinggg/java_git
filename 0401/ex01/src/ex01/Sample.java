package ex01;


import hyndai.*;
import hankook.*;	//�ѱ���Ű���� ��� Ŭ������ �̿�
import kumho.*;

public class Sample {

	public static void main(String[] args) {
		hankook.Tire t=new hankook.Tire();		//�ѱ��Ϲ�Ÿ�̾�>> Tire Ŭ������ �ΰ��̹Ƿ� Ŭ���� �̸��� �����.
		kumho.Tire t1=new kumho.Tire();			//��ȣ�Ϲ�Ÿ�̾�
		Engine e=new Engine();
		BigWidthTire t2=new BigWidthTire();
	}

}
