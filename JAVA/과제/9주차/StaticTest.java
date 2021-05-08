class Circle{
	private int raidus;
	public Circle(int radius) { this.raidus = radius;}
	public int getRadius() { return this.raidus; }
	public void setRadius(int radius) { this.raidus = radius;}
	
	
}

class CircleManager{
	static void copy(Circle src, Circle dest){
		dest.setRadius(src.getRadius());
	}
	static boolean equals (Circle a, Circle b) {
		if (a.getRadius() == b.getRadius())
			return true;
		else
			return false;
	}
}

public class StaticTest {

	public static void main(String[] args) {
		Circle pizza = new Circle(5);
		Circle waffle = new Circle(1);
		
		boolean res = CircleManager.equals(pizza, waffle);
		if(res==true)
			System.out.println("pizza와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle 크기 다름");
		
		CircleManager.copy(pizza, waffle);
		res = (pizza.getRadius() == waffle.getRadius());
		if(res==true)
			System.out.println("pizza와 waffle 크기 같음");
		else
			System.out.println("pizza와 waffle 크기 다름");
	}

}