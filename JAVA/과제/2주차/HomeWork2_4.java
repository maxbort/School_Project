import java.util.Scanner;
public class HomeWork2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x,y좌표값을 입력하세요>>");

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x >= 50 && x <= 100 && y >= 50 && y <= 100)
			System.out.print("점("+x+","+y+")은 (50,50)과 (100,100)의 사격형 내에 있습니다.");
		else
			System.out.print("점("+x+","+y+")은 (50,50)과 (100,100)의 사격형 내에 있지 않습니다.");
	}	
}