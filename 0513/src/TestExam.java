import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		
	System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int i=0;
	int sum=0;
	for(i=0; i<=a; i++){
	if(a%3==0 | a%7==0)
		sum+=a;
		
	}

	System.out.println("1~"+a+"���� 3�� ����̸鼭 7�� ����� ���� ����"+sum+"�Դϴ�.");
	}

}
