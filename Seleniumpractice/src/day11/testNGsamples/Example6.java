package day11.testNGsamples;

import org.testng.annotations.Test;

public class Example6 {
	 @Test
	    public void testcase8() {
		 displayDetails();
	    	System.out.println("Hello,I am TC8 from example4 class");
	    	 
}
	 @Test
	    public void testcase7() {
	    	System.out.println("Hello,I am TC7 from example4 class");
	    	 displayDetails();
}
	 void displayDetails() {
	    	System.out.println("I am display method of example6 class");
}
}