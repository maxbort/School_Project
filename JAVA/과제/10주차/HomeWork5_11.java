class A{
	public A() {
		System.out.println("������ A");
	}
	public A(int x) {
		System.out.println("�Ű����������� A" + x);
	}
}

class B extends A{
	public B() {
		System.out.println("������ B");
	}
	public B(int x) {
		super(x); //super()�� ù�ٿ� �Է��ؾ� �Ѵ�.
		System.out.print("�Ű����������� B" + x);
	}
}


public class HomeWork5_11 {

	public static void main(String[] args) {
		B b;
		b = new B(5);
	}

}