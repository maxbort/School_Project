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
			System.out.println(name +"�� ������ ���� ���α���, ���α���, ���̴� ���� " + width + ", " + vertical+ ", " + height + "�Դϴ�.");
			System.out.println(name + "�� ���Ǵ� " + volume + " �Դϴ�.");
			}
}
class Box_repair{
	public static void main(String[] args) {
			String shoe = "�Ź߻���";
			String snack= "���ڻ���";
			String fruit = "���ϻ���";
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
			System.out.println(shoe +"�� ���α��̴� " + A.get_width() + ", ���α��̴� " + A.get_vertical() + " ���̴� " + A.get_height() + "�Դϴ�.");
			System.out.println(shoe + "�� ���Ǵ� " + A.volume() + " �Դϴ�.");			
			System.out.println(snack +"�� ���α��̴� " + B.get_width() + ", ���α��̴� " + B.get_vertical() + " ���̴� " + B.get_height() + "�Դϴ�.");
			System.out.println(snack + "�� ���Ǵ� " + B.volume() + " �Դϴ�.");
			System.out.println(fruit +"�� ���α��̴� " + C.get_width() + ", ���α��̴� " + C.get_vertical() + " ���̴� " + C.get_height() + "�Դϴ�.");
			System.out.println(fruit + "�� ���Ǵ� " + C.volume() + " �Դϴ�.");

			C.Move(fruit, 1, 3, 7);
			}

}






