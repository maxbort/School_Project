import java.util.Scanner;
public class Recursion_HomeWork{
	public static void Reverse(int i, char[] rvs){
		int len = rvs.length;
		if(i> len){ // ��������
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
     		System.out.print("���ڿ��� �Է��Ͻÿ� >>>");
      		String str = sc.nextLine();
		char [] revst = str.toCharArray();
     		Reverse(1, revst); //��ȯ �Լ� ȣ��
   		   }
}

