package day19.blocks;

public class block3 {
	
	static {
		
		System.out.println("running static block1 of class block3...");
	}
	{
		System.out.println("running nonstatic block1 of class block3...");
	}
	public static void main(String[] args) {
	System.out.println("main() starts");
	block3 b1 = new block3();
	System.out.println("*****************************************************");
	block3 b2 = new block3();
	System.out.println("main() ends");
	}

}
