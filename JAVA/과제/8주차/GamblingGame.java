import java.util.Scanner;
class Player{
		private String name;
		public Player(String name) {
			this.name = name;
		}
		
		public String getName() {return name;}
}
public class GamblingGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player [] p = new Player[2];
		for(int i = 0; i<p.length; i++) {
			System.out.print("���� �̸� �Է� >> ");
			p[i] = new Player(sc.nextLine());
		}
		int n = 0 ;
		while(true) {
			System.out.print(p[n].getName()+"<Enter���� �ƹ��ų� ġ����>");
			sc.next();
			int[] val = new int[3];
			for(int i=0; i < val.length; i++) {
				val[i] = (int)(Math.random()*3);
				System.out.print(val[i] +" \t");
				}
			System.out.println();
			if(val[0] == val[1] && val[1] == val[2]) {
				System.out.println(p[n].getName() + "���� �¸�");
				break;
			}
				n++;
				n = n%2;
			}
			sc.close();
		}

	}

