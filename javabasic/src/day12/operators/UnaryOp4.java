package day12.operators;

public class UnaryOp4 {

	public static void main(String[] args) {
		int a = 0,b;
		b=a++ + ++a + ++a + a;
		 //0+   2    + 3  +3
		System.out.println(a);//3
		System.out.println(b);//8
		
		a=0;
		b= a-- + --a + --a + a;
		// 0   + -2  + -3  + -3
		System.out.println(a);//-3
		System.out.println(b);//-8
		
		a=0;
		b= a-- + --a + --a + a + ++a + a++;
		  //0  +  -2 + -3  + -3 + -2 + -2
		System.out.println(a);//-1
		System.out.println(b);//-12
		
		a=0;
		b= a-- + a + ++a + a++ + ++a + a++ +a;
		  //0  + 0 + 1   + 
		System.out.println(a);
		System.out.println(b);
	}

}
