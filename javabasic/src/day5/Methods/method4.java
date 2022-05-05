package day5.Methods;

public class method4 {

	public static void main(String[] args) {
		double sum= getAdditionResult(33,22);
		System.out.println("Addition is:"+sum);
		
		 sum= getAdditionResult(33.66,22);
		System.out.println("Addition is:"+sum);
		
		 sum= getAdditionResult(33.33,22.22);
		System.out.println("Addition is:"+sum);

	}
    static double getAdditionResult(double num1,double num2) {
    double res=num1 +num2;
    return res;
}
    static void getAdditionResult2(double num1,double num2) {
        double res=num1 +num2;
		System.out.println("Addition is:"+res);

}
}