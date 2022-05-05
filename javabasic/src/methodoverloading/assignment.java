package methodoverloading;

public class assignment {

	
	
		static int a=50;
		int b=50;
		public static void main(String[] args) {
		
		assignment.simpleinterest(10000,3.5,1);
		}	
		
	
	public  void simpleinterest(double pa, double rate, int time) {
    double si =(pa*rate*time)/100;
     System.out.println(si);
     //return si;
}
}