package day20Constructor;

public class Cons3 {
	
	 Cons3()  {
		 System.out.println("This is a zero-para constructor");
	 }

	 Cons3(char c)  {
		 System.out.println("This is a single-para constructor");
	 }
	 Cons3(double num1,int num2)  {
		 System.out.println("This is a double int-para constructor");
	 }
	 Cons3(int num1,double num2)  {
		 System.out.println("This is a int double-para constructor");
	 }
	 Cons3(int num1,int num2)  {
		 System.out.println("This is a int int double-para constructor");
	 }

	public static void main(String[] args) {
		Cons3 c1 = new Cons3();
		Cons3 c2 = new Cons3(10d,20);
		Cons3 c3 = new Cons3('d');
		Cons3 c4 = new Cons3(10d,30);
		Cons3 c5= new Cons3(20,20.30);

	}

}
