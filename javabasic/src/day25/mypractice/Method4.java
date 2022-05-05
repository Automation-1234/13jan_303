package day25.mypractice;

public class Method4 {

	public static void main(String[] args) {
		System.out.println("program starts...");
		 Method4 m1=new  Method4 ();
		double res= m1.getInterest(3688, 5.6, 60);
		 System.out.println("Interest:"+res);
		double res1= m1.getInterest1(44444, 5.8, 70);
		 System.out.println("Interest1:"+res);
		 m1.getInterest3(3065, 5.9, 30);
         
	}
       public double getInterest(int p,double r,int t)    {
    	   return(p*r*r)/100;
    	   
       }
       private double getInterest1(int p,double r,int t)  {
    	   double res=(p*r*r)/100;
    	   return res;
    	   
       }
       void getInterest3(int p,double r,int t)  {
    	   double res=(p*r*r)/100;
    	   System.out.println("Interest is :"+res);
       }
}
