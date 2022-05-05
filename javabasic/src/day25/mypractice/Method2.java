package day25.mypractice;

public class Method2 {

	public static void main(String[] args) {
		double sum=getadditionResult(25,30);
		System.out.println("Addition is :"+sum);
        
		 sum=getadditionResult(25.55,30);
			System.out.println("Addition is :"+sum);
			
			 sum=getadditionResult(25,30.555);
				System.out.println("Addition is :"+sum);
				System.out.println("*************************************************************");
				Method2.getadditionResult1(66,88);
	}
     static double getadditionResult(double num1,double num2) {
     double res = num1+num2;
     return res;
}
     static void getadditionResult1(double num1,double num2) {
         double res = num1+num2;
       System.out.println("Addition result is:"+res);
}
}