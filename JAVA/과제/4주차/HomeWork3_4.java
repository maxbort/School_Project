import java.util.Scanner;

public class HomeWork3_4{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			char [] day = {'��', '��', 'ȭ', '��', '��', '��', '��'};

			while(true) {
				System.out.print("������ �Է��Ͻÿ�>>> ");
			
		try{
			int i = sc.nextInt();
			if(i<0){
			System.out.print("���α׷� �����մϴ�...");
			break;
			}	
		  System.out.println(day[i%day.length]);
		}
	
	catch(Exception e) {
		System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
		sc.nextLine();
	}
	}
	sc.close();
	}
}
