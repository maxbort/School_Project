import java.util.Scanner;

public class HomeWork3_8{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);

		String RSParr[] = {"����", "����", "��"};

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �����մϴ�.");

		
		while(true){
			System.out.print("���� ���� ��! >>> ");
			String User = sc.next();

			int computer = (int)(Math.random()*3);

			if(User.equals("�׸�")){
				System.out.println("������ �����մϴ�...");
				break;
				}
		
			else if(RSParr[computer].equals("����")){
				if(User.equals("����")){
					System.out.println("����� =����, ��ǻ��=���� �����ϴ�.");
					}
				else if (User.equals("����")){
					System.out.println("�����=����, ��ǻ��=���� �̰���ϴ�.");
					}
				else if(User.equals("��")){
					System.out.println("�����=��, ��ǻ��=���� �����ϴ�.");
					}
				}
			if(RSParr[computer].equals("����")){
				if(User.equals("����")){
					System.out.println("�����=����, ��ǻ��=���� �����ϴ�.");
					}
				else if (User.equals("����")){
					System.out.println("�����=����, ��ǻ��=���� �����ϴ�.");
					}
				else if(User.equals("��")){
					System.out.println("�����=��, ��ǻ��=���� �̰���ϴ�.");
					}
				}
			if(RSParr[computer].equals("��")){
				if(User.equals("����")){
					System.out.println("�����=����, ��ǻ��=�� �̰���ϴ�.");
					}
				else if (User.equals("����")){
					System.out.println("�����=����, ��ǻ��=�� �����ϴ�.");
					}
				else if(User.equals("��")){
					System.out.println("�����=����, ��ǻ��=�� �����ϴ�.");
					}
				}
			}
		}
}


