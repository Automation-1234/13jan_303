package day19.blocks;

public class Block1 {

	
	{
			System.out.println("*****running static block1 of class blocks1...");
		}
		public static void main(String[] args) {
			System.out.println("main()starts");
			 Block1 b1=new Block1();
			 System.out.println("************************************");
			 Block1 b2=new Block1();
			System.out.println("main()ends");
		}
		{

			System.out.println("*****running static block2 of class blocks1...");

	}
}


