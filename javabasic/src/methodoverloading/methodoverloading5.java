package methodoverloading;

public class methodoverloading5 {

	
		public void square() {
			System.out.println("no parameter method called");
		}
		public void square(int number)  {
			int square =number*number;
			System.out.println("method with integer argument called:"+square);
		}
		public void square(float number)  {
			float square =number*number;
			System.out.println("method with float argument called:"+square);
		}
		public static void main(String[] args) {
			methodoverloading5 r1=new methodoverloading5();
			r1. square(2.5f);
			r1.square();
			r1.square(5);
		}
}