import java.util.Scanner;

public class HomeWork3_6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String eng[] = {"student", "love", "java", "happy", "futuer"};
		String kor[] = {"�л�", "���", "�ڹ�", "�ູ��", "�̷�"};


		while(true){
			System.out.print("���� �ܾ �Է��Ͻÿ�>>> ");
			String english = sc.next();
			
		if(english.equals("exit")){
			System.out.print("�����մϴ�...");
			break;
			}
		
		else{
			for(int i = 0; i < eng.length; i++){
				if(english.equals(eng[i])) {
					System.out.println(kor[i]);
					break;
						}
					
			else if(!english.equals(eng[i]) && i == 4) {
				System.out.println("�׷� ���� �ܾ�� �����ϴ�.");
					}
				}
			}
		}
	}
}
