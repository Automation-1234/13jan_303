package day21This;

public class ThisStatement01 {
	ThisStatement01()
	{
		System.out.println("*********zero para*********");
	}
	ThisStatement01(int age)
	{
		System.out.println("**********int para*********");
	}
	ThisStatement01(char c,double d)
	{
		System.out.println("**********char double para*********");
	}
	public static void main(String[] args) {
		ThisStatement01 t1=new ThisStatement01();
		ThisStatement01 t2=new ThisStatement01(45);
		ThisStatement01 t3 =new ThisStatement01('c',56.67);
	}
}