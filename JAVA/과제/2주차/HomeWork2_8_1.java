import java.util.Scanner;
public class HomeWork2_8_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ŀ�Ǹ� �ֹ��ϼ���>>");

		String coffee = sc.next();
		int Quantity = sc.nextInt();

		if(coffee.equals("����������"))
			System.out.println(2000*Quantity+"���Դϴ�.");
		else if(coffee.equals("�Ƹ޸�ī��"))
			System.out.println(2500*Quantity+"���Դϴ�.");
		else if(coffee.equals("īǪġ��"))
			System.out.println(3000*Quantity+"���Դϴ�.");
		else if(coffee.equals("ī���"))
			System.out.println(3500*Quantity+"���Դϴ�.");
		else
			System.out.println("�߸� �Է��Ͽ����ϴ�.");

	}
}	