package day19.blocks;

public class block4 {
	static int age;
    double salary;
	
	static {
		age=30;
		
	}
	{salary=40000;
	
	}

	public static void main(String[] args) {
		System.out.println("main()starts");
          System.out.println("age: "+block4.age);
          
          block4 b1 =new block4();
          
          System.out.println("salary: "+b1. salary);
          System.out.println("main()ends");
	}

}

