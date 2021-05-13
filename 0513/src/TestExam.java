import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		
	System.out.println("500 이하의 자연수를 입력하세요.");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int i=0;
	int sum=0;
	for(i=0; i<=a; i++){
	if(a%3==0 | a%7==0)
		sum+=a;
		
	}

	System.out.println("1~"+a+"까지 3의 배수이면서 7의 배수인 수의 합은"+sum+"입니다.");
	}

}
