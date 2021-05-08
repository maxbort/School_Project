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
			System.out.println( name +"를 변경한 후의 가로길이, 세로길이, 높이는 각각 " + width + ", " + vertical+ ", " + height + "입니다.");
			System.out.println(name + "의 부피는 " + volume2 + " 입니다.");
			}
		void Position(String name, int width, int vertical, int height){
			System.out.println(name +"의 가로길이는 " + width + ", 세로길이는 " + vertical + " 높이는 " + height + "입니다.");
			int volume = width * vertical * height;
			System.out.println(name + "의 부피는 " + volume + " 입니다.");
			}
		

	public static void main(String[] args) {
			String A = "신발상자";
			String B = "과자상자";
			String C = "과일상자";
			Test2 method = new Test2();
			method.Position(A, 2, 4, 7);
			method.Position(B, 5, 9, 10);
			method.Position(C, 3, 6, 9);

			method.Move(C, 3, 6, 9, 1, 1, 1);
			}
}


