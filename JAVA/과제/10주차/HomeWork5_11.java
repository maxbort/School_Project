class A{
	public A() {
		System.out.println("생성자 A");
	}
	public A(int x) {
		System.out.println("매개변수생성자 A" + x);
	}
}

class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		super(x); //super()는 첫줄에 입력해야 한다.
		System.out.print("매개변수생성자 B" + x);
	}
}


public class HomeWork5_11 {

	public static void main(String[] args) {
		B b;
		b = new B(5);
	}

}