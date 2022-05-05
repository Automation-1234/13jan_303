package day4.localGlobleVariable;

public class classB {
    int k=55;
    double s=77;
	public static void main(String[] args) {
		
		System.out.println("program starts..");
		
		classB b1 = new classB();
		System.out.println("k:" +b1.k);
		System.out.println("s:" +b1.s);
		
		b1.test1();
		System.out.println("program starts.."); }
	
	void test1() {
		System.out.println("running test1()...");
		
	}
}
	
	
		
	
	
		
		
		
		
		
		
		
	