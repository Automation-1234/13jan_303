package day19.blocks;

public class block2 {
	
	
	{
		  System.out.println("running non static block1 of class block2...");
	}

	public static void main(String[] args) {
		System.out.println("main()starts");
	      nonstaticblock1 b1 =new nonstaticblock1();
	      System.out.println("*************************************************");
	      nonstaticblock1 b2=new nonstaticblock1();
	      System.out.println("main()ends");

	}
	{
		  System.out.println("running non static block2of class block2...");
	}
}
