class MethodTest{        // Ŭ���� �̸�

	public static void main(String [] args){

                int x=10;    // ������
     	   int y=3;  	


	MethodTest calc = new MethodTest();
	// Ŭ���� Ÿ��

 	   System.out.println("���ϱ� : "+ calc.add(x,y));
  	   System.out.println("����   : "+  calc.sub(x,y));
	   System.out.println("���ϱ� : "+  calc.mul(x,y));
	   System.out.println("������ : "+  calc.div(x,y));		
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
	
	public static  int  div(int x, int y){ // ��� �޼ҵ�
		int result = x / y ;
		return result;
	}  
		
          
}