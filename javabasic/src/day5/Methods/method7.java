package day5.Methods;

public class method7 {

	public static void main(String[] args) {
		System.out.println( method7.getinterest(5000,6.5,60) );
		System.out.println( method7.getinterest(40000,6.5,60) );
		 double res=method7.getinterest(60000,6.5,56);
		 System.out.println(res);
	}
        public static double getinterest(int p,double r,double t)  {
        	return (p*r*t)/100;
        }
        public static double getInterest(int p,double r,double t)  {
        	double res=(p*r*t)/100;
        	return res;
        }
        public static void getInterest1(int p,double r,double t)  {
        	double res=(p*r*t)/100;
        System.out.println("Interest is:"+res);
}
}
