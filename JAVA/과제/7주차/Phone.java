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
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>>");
		Phone a = new Phone(sc.next(), sc.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>>");
		Phone b = new Phone(sc.next(), sc.next());
		System.out.println(a.getName() + "�� ��ȭ��ȣ" + a.getTel());
		System.out.println(b.getName() + "�� ��ȭ��ȣ" + b.getTel());
	
	}

}	
		