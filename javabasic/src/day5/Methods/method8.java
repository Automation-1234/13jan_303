package day5.Methods;

public class method8 {

	public static void main(String[] args) {
		System.out.println("program starts...");
		method8 m1=new method8();
	  double res=	m1.getInterest1(25000,5.6,60);
	  System.out.println("Interest:"+res);
		
	m1.getInterest2(40000, 6.9,72);
	
		System.out.println("program ends...");
	}
	public double getinterest(int p,double r,double t)  {
    	return (p*r*t)/100;
    }
   private  double getInterest1(int p,double r,double t)  {
    	double res=(p*r*t)/100;
    	return res;
    }
    private  void getInterest2(int p,double r,double t)  {
    	double res=(p*r*t)/100;
    System.out.println("Interest is:"+res);
}
}
