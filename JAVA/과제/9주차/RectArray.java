import java.util.Scanner;
class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() { return width*height; }
}
public class RectArray{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rect [] r = new Rect[4];
		int sum = 0;
		for(int i = 0; i < r.length; i++) {
			System.out.print((i+1) + " �ʺ�� ���� >>>");
			r[i] = new Rect(sc.nextInt(), sc.nextInt());
			sum += r[i].getArea();
		}
		System.out.println("�����Ͽ����ϴ�...");
		
		System.out.println("�簢�� ��ü�� ����" + sum);

	}

}