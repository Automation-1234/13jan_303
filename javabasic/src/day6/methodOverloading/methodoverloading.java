package day6.methodOverloading;

public class methodoverloading {

	public static void main(String[] args) {
	    System.out.println("sum : "+addnumbers());
	    System.out.println("sum : "+addnumbers(30,30)); 
	    System.out.println("sum : "+addnumbers(30,30,30));
	    System.out.println("sum : "+addnumbers(30,30.66,30));
	}
        static int addnumbers() {
        	System.out.println("********addnumbers() started**********");
        	int num1=10,num2=20;
        	System.out.println("*********addnumbers() before return");
        	return num1+num2;
        }
        static int addnumbers(int num1,int num2) {
        	System.out.println("********addnumbers() started**********");
        	
        	System.out.println("*********addnumbers() before return");
        	return num1+num2;
}
        static int addnumbers(int num1,int num2,int num3) {
        	System.out.println("********addnumbers() started**********");
        	
        	System.out.println("*********addnumbers() before return");
        	return num1+num2+num3;
}
        static double addnumbers(int num1,double num2,int num3) {
        	System.out.println("********addnumbers() started**********");
        	
        	System.out.println("*********addnumbers() before return");
        	return num1+num2+num3;
}
}
