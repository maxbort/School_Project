import java.util.Scanner;
public class HomeWork2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");

		int money = sc.nextInt();
		
		System.out.print("��������"+money/50000+"��, ");
		money %= 50000;
		System.out.print("����"+money/10000+"��, ");
		money %= 10000;
		System.out.print("õ��"+money/1000+"��, ");
		money %= 1000;
		System.out.print("500��"+money/500+"��, ");
		money %= 500;
		System.out.print("100��"+money/100+"��, ");
		money %= 100;
		System.out.print("10��"+money/10+"��, ");
		money %= 10;
		System.out.println("1��"+money+"��");
	}	
}