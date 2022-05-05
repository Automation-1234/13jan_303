package day12.operators;

public class Unaryop {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		int k = ++a;
		System.out.println("k: "+k);  //11  a+1 = 10+1=11
		System.out.println("a: "+a);  //11  
		int j = k++;
		System.out.println("k: "+k);  //12 k+1 11+1
		System.out.println("j: "+j);  //11
		
		int r = 21;
		System.out.println("r=: "+r++); //21  r=r+1,21+1
		System.out.println("r=: "+r); //22
		System.out.println("r=: " + ++r);//23
		System.out.println("r=: "+r); //23
		
		int x=105;
		System.out.println("x=:  "+ --x); //x=x-1,105-1
		System.out.println("x=: "+x); //105-1
		System.out.println("x=:  "+ x--);  //x= x-1, 105-1
		System.out.println("x=: "+x); //104-1
		
		
	}

}
