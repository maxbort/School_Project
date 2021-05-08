import java.util.Scanner;

public class Phone{
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름과 전화번호 입력 >>>");
		Phone a = new Phone(sc.next(), sc.next());
		System.out.print("이름과 전화번호 입력 >>>");
		Phone b = new Phone(sc.next(), sc.next());
		System.out.println(a.getName() + "의 전화번호" + a.getTel());
		System.out.println(b.getName() + "의 전화번호" + b.getTel());
	
	}

}	
		