
public class Sample {

	public static void main(String[] args) {
		Grade[] grade=new Grade[2];
		grade[0]=new Grade("01","ȫ�浿",90,70,77);
		grade[1]=new Grade("02","�̸���",80,75,67);
		
		for(int i=0; i<grade.length; i++) {
			grade[i].printGrade();
		}
	}
}
