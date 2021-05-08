/*
 * 전화번호 관리 프로그램 구현 프로젝트 
 * Version 02
 */
// readData()함수를 통해 친구에 대한 정보를 입력 받을 때 마다 친구 객체를 생성하여 반환해준다.
// main함수에서 readData()를 통해 객체 생성 후 showPhoneInfo()를 통해 내용을 출력한다.


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
		if(birth != null)  // 힌트: birth변수에 문자열이 할당되지 않으면 'null'값을 갖는다.
			System.out.println("birth: "+birth);
		
		System.out.println(" ");	// 데이터 구분을 위해
	}
}

class PhoneBookVer02
{
   public static PhoneInfo readData(){
//	PhoneInfo a = new PhoneInfo();
	PhoneInfo a;
	Scanner sc2 = new Scanner(System.in);
	System.out.print("이름, 번호, 생년월일을 입력하시오>>> ");
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