package ex03;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
//�л��� �������� ��		
		Report[] report=new Report[5];
		int count=0;
		
		report[0]=new Report();
		report[0].setSno("01");
		report[0].setSname("ȫ�浿");
		report[0].setKor(90);
		report[0].setEng(96);
		report[0].setMat(85);
		
		count++;
//===================================================	
		report[1]=new Report();
		report[1].setSno("02");
		report[1].setSname("�̸���");
		report[1].setKor(85);
		report[1].setEng(70);
		report[1].setMat(60);
		
		for(int i=0; i<count; i++) {
			report[i].printList();
		}
		
//========================================================

	/*	Report r=new Report(); 
			r.setSno("01");
			r.setSname("ȫ�浿");
			r.setKor(90);
			r.setEng(100);
			r.setMat(85);
			r.printList();
			r.printReport();*/
			
//ArrayList ���(�÷���) >> �߰��� ������ �޸� �����.
	//ArrayList<Report> array=new ArrayList<Report>();
	
/*	Report r=new Report();
		r.setSno("01");
		r.setSname("ȫ�浿");
		r.setKor(90);
		r.setEng(85);
		r.setMat(95);
		array.add(r);		
		
		r=new Report();
		r.setSno("02");
		r.setSname("�̸���");
		r.setKor(85);
		r.setEng(50);
		r.setMat(60);
		array.add(r);	
		
		for(int i=0; i<array.size(); i++) {
			r=array.get(i);
			r.printList();
		}*/
		
	}

	}


