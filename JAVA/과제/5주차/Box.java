public class Box{
		
		
		int width = 0;
		int vertical = 0;
		int height = 0;
		String name;
		
		void Move(String name, int width, int vertical, int height, int a, int b, int c){
			width += a;
			vertical -= b;
			height += c;
			int volume2 = width * vertical * height;
			System.out.println( name +"�� ������ ���� ���α���, ���α���, ���̴� ���� " + width + ", " + vertical+ ", " + height + "�Դϴ�.");
			System.out.println(name + "�� ���Ǵ� " + volume2 + " �Դϴ�.");
			}
		void Position(String name, int width, int vertical, int height){
			System.out.println(name +"�� ���α��̴� " + width + ", ���α��̴� " + vertical + " ���̴� " + height + "�Դϴ�.");
			int volume = width * vertical * height;
			System.out.println(name + "�� ���Ǵ� " + volume + " �Դϴ�.");
			}
		

	public static void main(String[] args) {
			String A = "�Ź߻���";
			String B = "���ڻ���";
			String C = "���ϻ���";
			Test2 method = new Test2();
			method.Position(A, 2, 4, 7);
			method.Position(B, 5, 9, 10);
			method.Position(C, 3, 6, 9);

			method.Move(C, 3, 6, 9, 1, 1, 1);
			}
}


