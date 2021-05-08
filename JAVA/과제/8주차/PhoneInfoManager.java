import java.util.Scanner;
class PhoneInfo{
	String name, phoneNumber, birth;
	public PhoneInfo(String name, String phoneNumber, String birth) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
	}
	public PhoneInfo() {};
	public String getName() {return name;}
	public String getphoneNumber() {return phoneNumber;}
	public String getbirth() {return birth;}
}

class Manager{
	Scanner sc = new Scanner(System.in);
	PhoneInfo [] friend;
	public void Maker(int a) {
		friend = new PhoneInfo[a];
		for(int i = 0; i<friend.length; i++) {
			System.out.print("이름>>> ");
			String name = sc.nextLine();
			System.out.print("전화번호>>> ");
			String phoneNumber = sc.nextLine();
			System.out.print("생일>>> ");
			String birth = sc.nextLine();
			friend [i] = new PhoneInfo(name,phoneNumber,birth);
		}

	}
	public void showInfo() {
		for(int i = 0; i<friend.length;i++) {
			System.out.print("name: "+ friend[i].getName() +"\n");
			System.out.print("phone: "+ friend[i].getphoneNumber()+ "\n");
			if(friend[i].birth != null)
				System.out.print("birth: " +friend[i].getbirth() +"\n");
			System.out.print("\n");
			}
			System.out.print("");
	}
	

}

public class PhoneInfoManager {

	public static void main(String[] args) {
		Manager mg = new Manager();
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("친구가 몇명인지 입력하시오 >>>");
		a = sc.nextInt();
		mg.Maker(a);
		mg.showInfo();


	}

}