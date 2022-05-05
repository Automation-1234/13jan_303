package day25.mypractice;

class A {
	A(){
		super ();
	}
	static int a=10;
	int b=20;
	double c=13.45;
}
class B extends A {
	B() {
		super ();
	}
	static int x=30;
	int y=40;
	double z=53.45;
}
class C extends B{
	C() {            //default constructor
		super();
	}
	   
	static int p=50;
	int q = 60;
	double r= 66.45;
}
public class Inheritance0 {

	public static void main(String[] args) {
		System.out.println(" class A static variable :"+A.a);
        System.out.println("class B static variable :"+B.x);
        System.out.println("class c static variable:"+C.p);
        
        A a1 =new A();
        System.out.println("class A non static variable b:"+a1.b);
        System.out.println("class A non static variable b:"+a1.c);
        
        B b1 =new B();
        System.out.println("class A non static variable b:"+b1.y);
        System.out.println("class A non static variable b:"+b1.z);
        System.out.println("class A non static variable b:"+b1.b);
        System.out.println("class A non static variable b:"+b1.c);
        C c1=new C();
        System.out.println("class A non static variable b:"+c1.q);
        System.out.println("class A non static variable b:"+c1.r);
        System.out.println("class A non static variable b:"+c1.y);
        System.out.println("class A non static variable b:"+c1.z);
        System.out.println("class A non static variable b:"+c1.b);
        System.out.println("class A non static variable b:"+c1.c);
	}

}

