public class HomeWork3_7 {
	public static void main(String[] args){
		for(int i =1; i<=99; i++){
			int first = i/10;
			int second = i %10;
		
			if(first == 0 && second % 3 == 0){ 
				System.out.println(i + " 박수 한번");
				}
			else if(first % 3 != 0 && second % 3 == 0){
					if(first%3 != 0 && second !=0) {
						System.out.println(i + " 박수 한번");
					}
				}
			else if(first%3==0 && second %3 !=0 && first!=0){
				System.out.println(i + " 박수 한번");
				}
			else if(first%3 == 0 && second == 0){
				System.out.println(i + " 박수 한번");
				}
			else if(first % 3 == 0 && second % 3 == 0){
					
						System.out.println(i + " 박수 두번");
					
				}
		}
	}
}