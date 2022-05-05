package day21This;

public class Thisstatement02 {
	Thisstatement02()
	{
		System.out.println("*********zero para*********");
	}
	Thisstatement02(int age)
	{
		System.out.println("**********int para*********");
	}
	Thisstatement02(char c,double d)
	{
		this();
		System.out.println("**********char double para*********");
	}
	public static void main(String[] args) {
//		Thisstatement02 t1=new Thisstatement02();
//		Thisstatement02 t2=new Thisstatement02(45);
		Thisstatement02 t3 =new Thisstatement02('c',56.67);

	
	}

}
