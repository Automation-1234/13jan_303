package day17.operators;

public class Unaryop3 {

	public static void main(String[] args) {
		int a =0,b;
		b=a++ + ++a + ++a + a;
	//	   0     2     3    3
		System.out.println("a:"+a);//3
		System.out.println("b:"+b);//8
		
		a=-5;
		b = a-- + --a + --a + a;
		  //  -5   -7    -8   -8
		System.out.println("a:"+a);//-8
		System.out.println("b:"+b);//-28
		
		a = 21;
		b = --a + --a + --a + a + ++a + a++;
		//   20    -19    18  18   19    19 
		System.out.println(a);//
		System.out.println(b);

		
		
		
	}

}
