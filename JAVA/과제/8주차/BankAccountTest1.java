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
//	    System.out.println("Lee's 계좌 잔고 : " + leesChecking.getBalance());
//	      
//	    leesChecking.withdraw(500);
//	    
//	    System.out.println("Lee's 계좌 잔고 : " + leesChecking.getBalance());
		
		String owner;
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("고객의 수를 입력하시오 >>");
		num = sc.nextInt();
		CustomerInfo [] manage = new CustomerInfo[num];
		for(int i = 0; i < manage.length; i++) {
			System.out.print("이름을 입력하시오 >>> ");
			String name = sc.next();
			System.out.print("계좌번호를 입력하시오 >>>");
			String account = sc.next();
			System.out.print("예금잔액을 입력하시오 >>> ");
			int balance = sc.nextInt();
			manage[i] = new CustomerInfo(name,account,balance);
			}
		
		for(int i = 0; i<manage.length; i++) {
			System.out.print("(" +manage[i].getName() +","+ manage[i].getAccount() +","+ manage[i].getBalance() + ")" + "\n");
		}
		
		System.out.print("예금주의 이름을 입력하시오 >>>");
		String player = sc.next();
		for(int i = 0; i<manage.length; i++) {
			if(manage[i].getName().equals(player)) {
				System.out.print("입금하실 금액 >>> ");
				int money1 = sc. nextInt();
				manage[i].deposit(money1);
				System.out.println(money1 +"원 입금 후"+ manage[i].getName() + "의 계좌잔고: "  + manage[i].getBalance());
				System.out.print("출금하실 금액>>> ");
				int money2 = sc.nextInt();
				manage[i].withdraw(money2);
				System.out.print(money2 + "출금 후" + manage[i].getName() + "의 계좌잔고: " + manage[i].getBalance());
			}
			else/*(!(manage[i].getName().equals(player)))*/ {
				System.out.print("");
			}
			
		}
		
		sc.close();

	}

}