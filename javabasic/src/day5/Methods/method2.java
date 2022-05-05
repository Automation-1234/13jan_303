package day5.Methods;

public class method2 {

	public static void main(String[] args) {
      double sum=getAdditionResult(25,44);
      System.out.println("Addition is :"+sum);
      sum=getAdditionResult(25,54);
      System.out.println("Addition is :"+sum);
      sum=getAdditionResult(24,44);
      System.out.println("Addition is :"+sum);
      sum=getAdditionResult(25,45);
      System.out.println("Addition is :"+sum);
      method2 .getAdditionResult2(44,12);
	}
	static double getAdditionResult(int num1,int num2) {
		double res = num1+num2;
		return res;
		
	}
	static void getAdditionResult2(int num1,int num2) {
		double res = num1+num2;
		System.out.println("Addition result:"+res);
}
}