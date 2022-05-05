package assignment;

public class assignment123 {
      
	  static int a=50;
		int b=50;
		
		public static void main(String[] args) {
			
			
			assignment123.SimpleInterest(1000,3.5,1);	
		
		
	}
		public static void SimpleInterest(double pa,double rate,int time) {
			
			   double si=(pa*rate*time)/100;
			   System.out.println(si);
			 
		}
}