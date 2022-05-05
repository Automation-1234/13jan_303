package day21This;

public class Thisstatement03 {
	Thisstatement03()
	{
		
		System.out.println("*********zero para*********");
	}
	Thisstatement03(int age)
	{
		this();
		System.out.println("**********int para*********");
	}
	Thisstatement03(char c,double d)
	{
		this(455);
		System.out.println("**********char double para*********");
	}
	public static void main(String[] args) {
//		Thisstatement02 t1=new Thisstatement02();
//		Thisstatement02 t2=new Thisstatement02(45);
		Thisstatement03 t3 =new Thisstatement03('c',56.67);

	

	}

}
