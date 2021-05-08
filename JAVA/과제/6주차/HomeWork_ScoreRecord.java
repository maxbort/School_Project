public class HomeWork_ScoreRecord{
	public static void main(String[] args){
		int total1, total2;

		Grade student1 = new Grade();
		Grade student2 = new Grade();

		student2.set_kor(90);
		student2.set_eng(90);
		student2.set_math(90);

		total1 = student1.get_kor() + student1.get_eng() + student1.get_math();
		total2 = student2.get_kor() + student2.get_eng() + student2.get_math();

		System.out.println(" Student1 °ú¸ñ Æò±Õ =" + total1 / 3.0);
		System.out.println(" Student2 °ú¸ñ Æò±Õ =" + total2 / 3.0);
	}
}

class Grade{
	int kor = 50;
	int eng = 50;
	int math = 50;
	void set_kor(int a){
		kor = a;
	}
	void set_eng(int b){
		eng = b;
	}
	void set_math(int c){
		math = c;
	}
	int get_kor(){
		return kor;
	}
	int get_eng(){
		return eng;
	}
	int get_math(){
		return math;
	}
		
}
