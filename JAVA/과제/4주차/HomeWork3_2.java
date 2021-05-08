import java.util.Scanner;
public class HomeWork3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aArray[];
		aArray = new int[10];
		System.out.println("정수 10개를 입력하시오>>> ");
		for(int i =0; i<10; i++){
			aArray[i] = sc.nextInt();
		
	}

	for(int i =0; i<10; i++){
		if(aArray[i]%3==0){

	System.out.print(aArray[i] + "");
	}
}
	sc.close();
  }
}