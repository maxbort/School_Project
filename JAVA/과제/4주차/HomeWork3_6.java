import java.util.Scanner;

public class HomeWork3_6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String eng[] = {"student", "love", "java", "happy", "futuer"};
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};


		while(true){
			System.out.print("영어 단어를 입력하시오>>> ");
			String english = sc.next();
			
		if(english.equals("exit")){
			System.out.print("종료합니다...");
			break;
			}
		
		else{
			for(int i = 0; i < eng.length; i++){
				if(english.equals(eng[i])) {
					System.out.println(kor[i]);
					break;
						}
					
			else if(!english.equals(eng[i]) && i == 4) {
				System.out.println("그런 영어 단어는 없습니다.");
					}
				}
			}
		}
	}
}
