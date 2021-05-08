class A{
	public A() {
		System.out.println("생성자 A");
	}
	public A(int x) {
		System.out.println("매개변수생성자 A");
	}
}

class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		System.out.print("매개변수생성자 B");
	}
}


public class HomeWork5_10 {

	public static void main(String[] args) {
		B b;
		b = new B(5);

	}

}