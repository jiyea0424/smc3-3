import java.util.Scanner;

public class prob_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		grade g = new grade();
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է� >>");
		
		g.math = sc.nextInt();
		g.science = sc.nextInt();
		g.english = sc.nextInt();
	
	
		g.average(g.math, g.science, g.english);
		}

}
class grade {
	int math=0, science=0, english=0;
	
	grade(){}
	
	public void average(int math, int science, int english){
		System.out.println("��հ� : "+(math+science+english)/3);
	}
}