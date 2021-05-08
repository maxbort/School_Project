class MethodTest{        // 클래스 이름

	public static void main(String [] args){

                int x=10;    // 정수형
     	   int y=3;  	


	MethodTest calc = new MethodTest();
	// 클래스 타입

 	   System.out.println("더하기 : "+ calc.add(x,y));
  	   System.out.println("빼기   : "+  calc.sub(x,y));
	   System.out.println("곱하기 : "+  calc.mul(x,y));
	   System.out.println("나누기 : "+  calc.div(x,y));		
	}

            int add(int x, int y){
	  	int result = x + y;
		return result; 
		 
	}
	
	int sub(int x, int y){
		int result = x - y;
		return result;  
	  
	}
	
	int mul(int x, int y){
		int result = x*y;
		return result;  
		 
	}
	
	public static  int  div(int x, int y){ // 멤버 메소드
		int result = x / y ;
		return result;
	}  
		
          
}