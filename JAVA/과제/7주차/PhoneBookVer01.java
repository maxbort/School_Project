/*
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ 
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
		if(birth != null)  // ��Ʈ: birth������ ���ڿ��� �Ҵ���� ������ 'null'���� ���´�.
			System.out.println("birth: "+birth);
		
		System.out.println("");	// ������ ������ ����
	}
}

class PhoneBookVer01
{
    public static void main(String[] args)
    {
        PhoneInfo pInfo1=new PhoneInfo("��Һ�", "010-7890-1234", "99,09,12");
        PhoneInfo pInfo2=new PhoneInfo("�߼�ȣ", "010-4072-7788");
        pInfo1.showPhoneInfo();
        pInfo2.showPhoneInfo();	
    }
}