import java.util.Scanner;

public class HomeWork3_4{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			char [] day = {'일', '월', '화', '수', '목', '금', '토'};

			while(true) {
				System.out.print("정수를 입력하시오>>> ");
			
		try{
			int i = sc.nextInt();
			if(i<0){
			System.out.print("프로그램 종료합니다...");
			break;
			}	
		  System.out.println(day[i%day.length]);
		}
	
	catch(Exception e) {
		System.out.println("경고! 수를 입력하지 않았습니다.");
		sc.nextLine();
	}
	}
	sc.close();
	}
}
