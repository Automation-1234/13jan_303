package day19.blocks;

public class nonstaticblock1 {
	
	{
		System.out.println("running non static blocl1 of class block1...");
	}

	public static void main(String[] args) {
	System.out.println("main()starts");
      nonstaticblock1 b1=new nonstaticblock1();
      System.out.println("*************************************************");
      nonstaticblock1 b2=new nonstaticblock1();
      System.out.println("main()ends");
      
      nonstaticblock1 b3=new nonstaticblock1();
      System.out.println("main() I am ...");
	}

}
