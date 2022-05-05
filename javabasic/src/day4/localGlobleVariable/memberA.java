package day4.localGlobleVariable;

public class memberA {

	   static int i;
	   static double d;
	public static void main(String[] args) {
		
	 System.out.println("program starts...");
	 System.out.println("memberA: "+i);
	 System.out.println("memberA: "+d);
	 memberA.i=10;
	 memberA.d=23.45;
	  System.out.println("memberA:" +memberA.i);
	  System.out.println("memberA:" +memberA.d);
	  
	}

}
