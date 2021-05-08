class A{
	public A(int x) {
		System.out.println("持失切 A");
	}
	public A() {}
}

class B extends A{
	public B() {
		System.out.println("持失切 B");
	}
}


public class HomeWork5_9 {

	public static void main(String[] args) {
		B b;
		b = new B();

	}

}