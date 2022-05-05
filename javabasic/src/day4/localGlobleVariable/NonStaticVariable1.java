package day4.localGlobleVariable;

public class NonStaticVariable1 {
	 //global variable
	int mobileNum=123; //non static
	public static void main(String[] args) {
	    System.out.println("program Starts...");
	    
	    NonStaticVariable1 ref = new NonStaticVariable1();//creating instance/object of class
	    System.out.println("1st ref, NonStatic Globle Variable:"+ref.mobileNum);
	    
	        ref. mobileNum=456;
	        System.out.println("1st ref,Updated NonStatic Globle Variable:"+ref.mobileNum);
           
	        System.out.println("program Starts..."); 
	        
	     NonStaticVariable1 ref1= new NonStaticVariable1();
	    System.out.println("2nd ref,updated NonStatic Globle Variable:"+ref1.mobileNum);
	    System.out.println("program ends..."); 
	    
	    
	}

}
