class A{
	public A() {
		System.out.println("������ A");
	}
	public A(int x) {}
}

class B extends A{
	public B() {
		System.out.println("������ B");
	}
}


public class HomeWork5_8 {

	public static void main(String[] args) {
		B b;
		b = new B();

	}

}
