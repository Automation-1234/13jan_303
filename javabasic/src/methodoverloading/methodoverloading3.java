package methodoverloading;

public class methodoverloading3 {

	public static void main(String[] args) {
		 methodoverloading3 r1=new  methodoverloading3();
		System.out.println("sum1:"+ r1.addNumbers());
		System.out.println("sum2:"+ r1.addNumbers(20,30));
		System.out.println("sum3:"+ r1.addNumbers(20,40));
		System.out.println("sum4: "+r1.addNumbers(50,50));
	}
	  int addNumbers()  {
	    	int num1=10,num2=20;
	    	return num1+num2;
	    }
	  int addNumbers(int num1,int num2)  {
	    	
	    	return num1+num2;
	}
	  int addNumbers(int num1,int num2,int num3)  {
	    	
	    	return num1+num2+num3;

}
	  int addnumbers(int num1,int num2,int num3,int num4)  {
		  return num1+num2+num3+num4;
	  }
}