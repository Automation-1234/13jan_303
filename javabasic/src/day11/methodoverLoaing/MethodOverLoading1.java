package day11.methodoverLoaing;

public class MethodOverLoading1 {

	public static void main(String[] args) {
		System.out.println("sum: "+addNumbers());

	}
     static int addNumbers() {
     System.out.println("***********addNumbers()started***********");
     int num1=10,num2=20;
     System.out.println("***********addNumbers()before return**********");
     return num1+num2;
	}
}
	

