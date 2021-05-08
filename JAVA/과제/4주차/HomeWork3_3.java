import java.util.Scanner;
import java.util.InputMismatchException;

public class HomeWork3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>>> ");
		
		try{
			int a = sc.nextInt();

			if(a%2==0){
				System.out.print("짝수");
			}
			else{
				System.out.print("홀수");
			
			}
	}
		catch(InputMismatchException a){
			System.out.print("수를 입력하지않아 종료합니다.");
							}

			sc.close();
	}
}