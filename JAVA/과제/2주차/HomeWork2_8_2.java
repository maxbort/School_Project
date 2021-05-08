import java.util.Scanner;
public class HomeWork2_8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("커피를 주문하세요>>");

		String coffee = sc.next();
		int Quantity = sc.nextInt();
		
		switch (coffee) {
		case "에스프레소":
			System.out.println(2000*Quantity+"원입니다.");
			break;
		case "아메리카노": 
			System.out.println(2500*Quantity+"원입니다.");
			break;
		case "카푸치노": 
			System.out.println(3000*Quantity+"원입니다.");
			break;
		case "카페라떼": 
			System.out.println(3500*Quantity+"원입니다.");
			break;
		default:
			System.out.println("잘못 입력하엿습니다.");
			break;
		}
	}	
}