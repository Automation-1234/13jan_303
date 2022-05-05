package day4.localGlobleVariable;

public class StaticGlobleVariable2 {

	     static int mobileNumber=123;
	     public static void main(String[] args) {
	     System.out.println("Program starts...");	 
	     System.out.println("SGV : "+mobileNumber);	
	     System.out.println("SGV with standard: "+StaticGlobleVariable2.mobileNumber);
	     System.out.println("***********************");
	     
	     mobileNumber=456; //re initilation  updating value of age variable
	     System.out.println("Program starts...");	 
	     System.out.println("SGV : "+mobileNumber);	
	     System.out.println("SGV with standard: "+StaticGlobleVariable2.mobileNumber);	
	     System.out.println("***********************");
	     
	    int mobileNumber=789;
	     System.out.println("Program starts...");	 
	     System.out.println("local variable : "+mobileNumber);	
	     System.out.println("SGV with standard: "+StaticGlobleVariable2.mobileNumber);
	}

}
