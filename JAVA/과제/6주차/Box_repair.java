class Box{
		
		int width = 0;
		int vertical = 0;
		int height = 0;
		String name;


		void set_width(int a){
			width = a;
		}
		void set_vertical(int b){
			vertical = b;
		}
		void set_height(int c){
			height = c;
		}
		int get_width(){
			return width;
		}
		int get_vertical(){
			return vertical;
		}
		int get_height(){
			return height;
		}
		int volume(){
			int volume = width*vertical*height;
			return volume;
			}
		void Move(String name, int a, int b, int c){
			width += a;
			vertical -= b;
			height += c;
			int volume = width * vertical * height;
			System.out.println(name +"를 변경한 후의 가로길이, 세로길이, 높이는 각각 " + width + ", " + vertical+ ", " + height + "입니다.");
			System.out.println(name + "의 부피는 " + volume + " 입니다.");
			}
}
class Box_repair{
	public static void main(String[] args) {
			String shoe = "신발상자";
			String snack= "과자상자";
			String fruit = "과일상자";
			Box A = new Box();
			Box B = new Box();
			Box C = new Box();
			A.set_width(3);
			A.set_vertical(4);
			A.set_height(7);
			B.set_width(5);
			B.set_vertical(9);
			B.set_height(10);
			C.set_width(3);
			C.set_vertical(6);
			C.set_height(9); 
			System.out.println(shoe +"의 가로길이는 " + A.get_width() + ", 세로길이는 " + A.get_vertical() + " 높이는 " + A.get_height() + "입니다.");
			System.out.println(shoe + "의 부피는 " + A.volume() + " 입니다.");			
			System.out.println(snack +"의 가로길이는 " + B.get_width() + ", 세로길이는 " + B.get_vertical() + " 높이는 " + B.get_height() + "입니다.");
			System.out.println(snack + "의 부피는 " + B.volume() + " 입니다.");
			System.out.println(fruit +"의 가로길이는 " + C.get_width() + ", 세로길이는 " + C.get_vertical() + " 높이는 " + C.get_height() + "입니다.");
			System.out.println(fruit + "의 부피는 " + C.volume() + " 입니다.");

			C.Move(fruit, 1, 3, 7);
			}

}






