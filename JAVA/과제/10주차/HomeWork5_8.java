class A{
	public A() {
		System.out.println("持失切 A");
	}
	public A(int x) {}
}

class B extends A{
	public B() {
		System.out.println("持失切 B");
	}
}


public class HomeWork5_8 {

	public static void main(String[] args) {
		B b;
		b = new B();

	}

}
