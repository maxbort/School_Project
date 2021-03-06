/*
 * 전화번호 관리 프로그램 구현 프로젝트 
 * Version 0.1
 */

class PhoneInfo
{
	String name;
	String phoneNumber;
	String birth;
	
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
		
		System.out.println("");	// 데이터 구분을 위해
	}
}

class PhoneBookVer01
{
    public static void main(String[] args)
    {
        PhoneInfo pInfo1=new PhoneInfo("김소빈", "010-7890-1234", "99,09,12");
        PhoneInfo pInfo2=new PhoneInfo("추성호", "010-4072-7788");
        pInfo1.showPhoneInfo();
        pInfo2.showPhoneInfo();	
    }
}