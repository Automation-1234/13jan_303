package day7.operators;

public class Unaryop {

	public static void main(String[] args) {
		int a=20;
		int b= a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int k= ++a;
		System.out.println("k:"+k);//21
		System.out.println("b:"+b);//20
		int j= k++;
		System.out.println("k:"+k);//22
		System.out.println("j:"+j);//21
		
		int r=22;
		System.out.println("r=:"+r++);//
		System.out.println("r=:"+r);
		System.out.println("r=:" + ++r);
		System.out.println("r=:"+r);
		
		int x=104;
		System.out.println("x=:"+--x);//103
		System.out.println("x=:"+x);//103
		System.out.println("x=:"+ x--);//103
		System.out.println("x=:"+x);//102
		
		int x1=106;
		System.out.println("x1=:"+--x1);//105
		System.out.println("x1=:"+x1);//105
		System.out.println("x1=:"+ x1--);//105
		System.out.println("x1=:"+x1);//104
		
		int r1=22;
		System.out.println("r1=:"+r1++);//22
		System.out.println("r1=:"+r1);//23
		System.out.println("r1=:" + ++r1);//24
		System.out.println("r1=:"+r1);//24
		
		int x3=10;
		System.out.println("x3=:"+--x3);//9
		System.out.println("x3=:"+x3);//9
		System.out.println("x3=:"+ x3--);//9
		System.out.println("x3=:"+x3);//8
	}

}
