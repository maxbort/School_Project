import java.util.Scanner;
public class HomeWork2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x,y��ǥ���� �Է��ϼ���>>");

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x >= 50 && x <= 100 && y >= 50 && y <= 100)
			System.out.print("��("+x+","+y+")�� (50,50)�� (100,100)�� ����� ���� �ֽ��ϴ�.");
		else
			System.out.print("��("+x+","+y+")�� (50,50)�� (100,100)�� ����� ���� ���� �ʽ��ϴ�.");
	}	
}