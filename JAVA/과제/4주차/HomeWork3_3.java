import java.util.Scanner;
import java.util.InputMismatchException;

public class HomeWork3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>>> ");
		
		try{
			int a = sc.nextInt();

			if(a%2==0){
				System.out.print("¦��");
			}
			else{
				System.out.print("Ȧ��");
			
			}
	}
		catch(InputMismatchException a){
			System.out.print("���� �Է������ʾ� �����մϴ�.");
							}

			sc.close();
	}
}