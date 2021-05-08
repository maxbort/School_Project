import java.util.Scanner;

public class HomeWork3_5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int[] Nums = new int[10];
		int Numsize = 0;

		System.out.print("정수 10개를 입력하시오>>> ");
		for(int i = 0; i < 10; i++){
			Nums[i] = sc.nextInt();
		}

		for(int i = 0; i < Nums.length; i++){
			for(int j = 0 ; j<Nums.length-i-1; j++){
				if(Nums[j]>Nums[j+1]){
					Numsize = Nums[j];
					Nums[j] = Nums[j+1];
					Nums[j+1] = Numsize;
				}
			}
		}

		for(int i =0; i < 10; i++){
			System.out.print(Nums[i] + " ");
		}
	}
}
