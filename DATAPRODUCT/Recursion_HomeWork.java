import java.util.Scanner;
public class Recursion_HomeWork{
	public static void Reverse(int i, char[] rvs){
		int len = rvs.length;
		if(i> len){ // 종료조건
			return;
			}
		else{
			System.out.print(rvs[len-i]);
			i++;
				}
     	
   		Reverse(i, rvs);
     			 }
		
   	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
     		System.out.print("문자열을 입력하시오 >>>");
      		String str = sc.nextLine();
		char [] revst = str.toCharArray();
     		Reverse(1, revst); //순환 함수 호출
   		   }
}

