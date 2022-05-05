package day7.operators;

public class Unaryop1 {

	public static void main(String[] args) {
//		int a=50, b;
//		b=a++;
//		int x =a,y;
//		System.out.println(x);//51
//		y= ++x;
//		System.out.println(a);//51
//          System.out.println(b);//50
//          System.out.println(x );//52
//          System.out.println(y);//
//          
//          int p=-15,q=25,res;
//          res=p++ + --q;
//          System.out.println("res:"+res);//
//          System.out.println("p:"+p);//-14
//          System.out.println("q:"+q);//24
//          
//          int res1=++p + ++q;
//          System.out.println(res1);//12
//          System.out.println("p:"+p);//-13
//          System.out.println("q:"+q);//25
          
          int p1=-16,q1=30,res2;
          res2=p1++ + --q1;
          System.out.println("res2:"+res2);//13
          System.out.println("p1:"+p1);//-15
          System.out.println("q1:"+q1);//29
          
          int res4=++p1 + ++q1;
          System.out.println(res4);//16
          System.out.println("p1:"+p1);//-14
          System.out.println("q1:"+q1);//30
	}

}
