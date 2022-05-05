package day5.Methods;

public class method6 {

	public static void main(String[] args) {
		double   sub =getsubstractionResult(10,5);
		System.out.println("substraction is :"+sub);
		
		sub=getsubstractionResult(50,30);
		System.out.println("substraction is :"+sub);
		
		sub=getsubstractionResult(50.50,30.70);
		System.out.println("substraction is :"+sub);
		
		 method6.getsubstractionResult1(40,30);
		 System.out.println( method6.getsubstractionResult1(70,10));

	}
           static double getsubstractionResult(double num1,double num2) {
        	   double res =num1-num2;
        	   return res;
           }
           static void getsubstractionResult1(double num1,double num2) {
        	   double res =num1-num2;
        	 System.out.println("substraction is:"+res);
}
}
