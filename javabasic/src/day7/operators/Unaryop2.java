package day7.operators;

public class Unaryop2 {

	public static void main(String[] args) {
		int a=0,b;
		b= a++ + ++a + ++a +a;
		// 0      2     3     3 
		System.out.println("a:"+a);//3
        System.out.println("b:"+b);//8
        
        a=-5;
        b= a-- + --a + --a +a;
    //     -5     -7    -8 -8
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        
        a=22;
        b=--a + --a + --a +a + ++a  +a++;
        //  21   20   19  19   20    20
        System.out.println(a);
        System.out.println(b);//
	}

}
