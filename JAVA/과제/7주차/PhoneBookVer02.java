/*
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ 
 * Version 02
 */
// readData()�Լ��� ���� ģ���� ���� ������ �Է� ���� �� ���� ģ�� ��ü�� �����Ͽ� ��ȯ���ش�.
// main�Լ����� readData()�� ���� ��ü ���� �� showPhoneInfo()�� ���� ������ ����Ѵ�.


import java.util.Scanner;
class PhoneInfo
{
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(){}
	public PhoneInfo(String name, String num, String birth)
	{
	
          	  this.name = name;
	  this.phoneNumber = num;		
	  this.birth = birth;


	}
	public PhoneInfo(String name, String num)
	{
		this.name = name;
		this.phoneNumber = num;

	}
	public void showPhoneInfo()
	{
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);
		if(birth != null)  // ��Ʈ: birth������ ���ڿ��� �Ҵ���� ������ 'null'���� ���´�.
			System.out.println("birth: "+birth);
		
		System.out.println(" ");	// ������ ������ ����
	}
}

class PhoneBookVer02
{
   public static PhoneInfo readData(){
//	PhoneInfo a = new PhoneInfo();
	PhoneInfo a;
	Scanner sc2 = new Scanner(System.in);
	System.out.print("�̸�, ��ȣ, ��������� �Է��Ͻÿ�>>> ");
	String friend = sc2.nextLine();
	String phone  = sc2.nextLine();
	String birth = sc2.nextLine();

	/*if(a.birth.equals("\0"))
		a = new PhoneInfo(friend, phone);
	else*/
	a = new PhoneInfo(friend, phone, birth);
	return a;
	}	
    public static void main(String[] args)
    {	
	PhoneInfo f1=readData();
	PhoneInfo f2=readData();
	PhoneInfo f3=readData();

              f1.showPhoneInfo();
              f2.showPhoneInfo();
              f3.showPhoneInfo();



    }
}