import java.util.Scanner;
public class HomeWork2_8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ŀ�Ǹ� �ֹ��ϼ���>>");

		String coffee = sc.next();
		int Quantity = sc.nextInt();
		
		switch (coffee) {
		case "����������":
			System.out.println(2000*Quantity+"���Դϴ�.");
			break;
		case "�Ƹ޸�ī��": 
			System.out.println(2500*Quantity+"���Դϴ�.");
			break;
		case "īǪġ��": 
			System.out.println(3000*Quantity+"���Դϴ�.");
			break;
		case "ī���": 
			System.out.println(3500*Quantity+"���Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			break;
		}
	}	
}