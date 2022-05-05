package day4.localGlobleVariable;

public class TestVariable3 {
	static int a =26;
	double b=444;
	public static void main(String[] args) {
		System.out.println("program starts...");
		TestVariable3 ref1= new TestVariable3();
		System.out.println("b: "+ref1.b);
		System.out.println("a: "+TestVariable3.a);
		System.out.println("program ends...");
		
		
		
		
		
	}

}
