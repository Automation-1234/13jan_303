package day6.methodOverloading;

public class methodoverloading1 {
	public static void main() {
		System.out.println("i am main...");
	
}
	public static void main(String[] args) {
		main();
		methodoverloading1 m1 =new methodoverloading1();
		System.out.println("sum: " +m1.addnumbers());
		System.out.println("sum: " +m1.addnumbers(20,20));
		System.out.println("sum: " +m1.addnumbers(20,20,20));
		System.out.println("sum: " +m1.addnumbers(50,50.50,50));
		m1.display();
		m1.display1();
		System.out.println("sum:4 " +m1.addnumbers(100,50.50,500));
	}
	void display() {
		System.out.println("I am ritali");
	}
	void display1() {
		System.out.println("I am pooja");
	}
	  int addnumbers() {
     	System.out.println("********addnumbers() started**********");
     	int num1=10,num2=20;
     	System.out.println("*********addnumbers() before return");
     	return num1+num2;
     }
      int addnumbers(int num1,int num2) {
     	System.out.println("********addnumbers() started**********");
     	
     	System.out.println("*********addnumbers() before return");
     	return num1+num2;
}
      int addnumbers(int num1,int num2,int num3) {
     	System.out.println("********addnumbers() started**********");
     	
     	System.out.println("*********addnumbers() before return");
     	return num1+num2+num3;
}
     double addnumbers(int num1,double num2,int num3) {
     	System.out.println("********addnumbers() started**********");
     	
     	System.out.println("*********addnumbers() before return");
     	return num1+num2+num3;
}
     double addnumbers1(int num1,double num2,int num3) {
    	 return num1+num2+num3;
     }
}
