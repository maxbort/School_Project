import java.util.Scanner;
class CustomerInfo{
	String name, account;
	int balance;
	
	public CustomerInfo(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	public String getName() {return name;}
	public String getAccount() {return account;}
	public int getBalance() {return balance;}
	public void deposit(int a) {
		balance += a;
	}
	public void withdraw(int a) {
		balance -= a;
	}
	public CustomerInfo() {};
}


public class BankAccountTest1 {

	public static void main(String[] args) {
//        CustomerInfo leesChecking = new CustomerInfo();
//
//	    leesChecking.deposit(2000);
//	      
//	    System.out.println("Lee's ���� �ܰ� : " + leesChecking.getBalance());
//	      
//	    leesChecking.withdraw(500);
//	    
//	    System.out.println("Lee's ���� �ܰ� : " + leesChecking.getBalance());
		
		String owner;
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("���� ���� �Է��Ͻÿ� >>");
		num = sc.nextInt();
		CustomerInfo [] manage = new CustomerInfo[num];
		for(int i = 0; i < manage.length; i++) {
			System.out.print("�̸��� �Է��Ͻÿ� >>> ");
			String name = sc.next();
			System.out.print("���¹�ȣ�� �Է��Ͻÿ� >>>");
			String account = sc.next();
			System.out.print("�����ܾ��� �Է��Ͻÿ� >>> ");
			int balance = sc.nextInt();
			manage[i] = new CustomerInfo(name,account,balance);
			}
		
		for(int i = 0; i<manage.length; i++) {
			System.out.print("(" +manage[i].getName() +","+ manage[i].getAccount() +","+ manage[i].getBalance() + ")" + "\n");
		}
		
		System.out.print("�������� �̸��� �Է��Ͻÿ� >>>");
		String player = sc.next();
		for(int i = 0; i<manage.length; i++) {
			if(manage[i].getName().equals(player)) {
				System.out.print("�Ա��Ͻ� �ݾ� >>> ");
				int money1 = sc. nextInt();
				manage[i].deposit(money1);
				System.out.println(money1 +"�� �Ա� ��"+ manage[i].getName() + "�� �����ܰ�: "  + manage[i].getBalance());
				System.out.print("����Ͻ� �ݾ�>>> ");
				int money2 = sc.nextInt();
				manage[i].withdraw(money2);
				System.out.print(money2 + "��� ��" + manage[i].getName() + "�� �����ܰ�: " + manage[i].getBalance());
			}
			else/*(!(manage[i].getName().equals(player)))*/ {
				System.out.print("");
			}
			
		}
		
		sc.close();

	}

}