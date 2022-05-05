package day17.operators;

public class Unaryop2 {

	public static void main(String[] args) {
		int a=47,b;
		b = a++;
		int x= a,y;
		System.out.println(x);//48
         y=++x;
         System.out.println(a);
         System.out.println(b);
         System.out.println(x);
         System.out.println(y);
         
         int p=-15,q=25,res;
         
         res=p++ + --q;
         System.out.println("res :"+res);
         System.out.println("p :"+p);//p+1=-15+1
         System.out.println("q :"+q);
         
         int res1 = ++p + ++q;
         System.out.println(q);
         System.out.println("p :"+p);
         System.out.println("q :"+q);
         
	}

}
