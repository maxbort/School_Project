class A{
	public A(int x) {
		System.out.println("������ A");
	}
	public A() {}
}

class B extends A{
	public B() {
		System.out.println("������ B");
	}
}


public class HomeWork5_9 {

	public static void main(String[] args) {
		B b;
		b = new B();

	}

}