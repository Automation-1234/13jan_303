package methodoverloading;

public class IntroducingOverloading {

	public static void main(String[] args) {
		yojana(50,50);
		ritali(100,20);
		
		IntroducingOverloading.yojana(50,50);
		IntroducingOverloading.ritali(100,20);
		
		}
	//IntroducingOverloading m1=new IntroducingOverloading();

     //m1.ritali(); 
	
	

	public static void yojana(int b, int c) {
		int a=b+c;
		System.out.println("this is addition yojana method" + a);
	}
		
		public  void yojana(int b, int c, int d) {
			int a=b+c+d;
			System.out.println( a);
		}
			
			public static void ritali(int r, int c) {
				int res=r*c;
				System.out.println( "this is multiplicatin of ritali"+res);	
			}
	   	
			public  void ritali(int r , int c , int h , int y) {
				int res=r-c-h-y;
				System.out.println("this is non static of ritali "+ res);	
			}
			
			
			
			
			
			
			
			
	}

