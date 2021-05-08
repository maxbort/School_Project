public class ScoreRecord{
	public static void scoreCalc(int kor, int eng, int math){
      		total(kor, eng, math);
	   }


	public static void total(double kor, double eng, double math){
		double score;
	
		score = kor + eng + math;
	
      	  System.out.println(score);
 	  }

   	public static void main(String[] args){
      		int kor = 97;
     		int eng = 95;
     		int math = 100;
       	
      		scoreCalc(kor, eng, math);
	
    }
  }
  