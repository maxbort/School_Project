import java.util.Scanner;
public class HomeWork2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");

		int money = sc.nextInt();
		
		System.out.print("오만원권"+money/50000+"개, ");
		money %= 50000;
		System.out.print("만원"+money/10000+"개, ");
		money %= 10000;
		System.out.print("천원"+money/1000+"개, ");
		money %= 1000;
		System.out.print("500원"+money/500+"개, ");
		money %= 500;
		System.out.print("100원"+money/100+"개, ");
		money %= 100;
		System.out.print("10원"+money/10+"개, ");
		money %= 10;
		System.out.println("1원"+money+"개");
	}	
}