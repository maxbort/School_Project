import java.util.Scanner;
public class HomeWork2_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a logical operation>>");

		boolean a = sc.nextBoolean();
		String operator = sc.next();
		boolean b = sc.nextBoolean();

		switch (operator) {
		case "AND":
			System.out.println(a&b);
			break;
		case "OR":
			System.out.println(a||b);
			break;

		default:
			System.out.println("Invalid logical operator");
			break;
		}

	}	
}