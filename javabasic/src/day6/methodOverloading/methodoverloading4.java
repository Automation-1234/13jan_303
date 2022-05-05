package day6.methodOverloading;
class Displayoverloading{
	public void disp( char c) {
		System.out.println(c);
	}
	public void disp( char c,int num) {
		System.out.println(c +""+num);
	}
	public void callme() {
		System.out.println("i am callme ");
	}
	
}
public class methodoverloading4 {
 void display() {
	 System.out.println("i am display...");
 }
	public static void main(String[] args) {
		Displayoverloading m1=new Displayoverloading();
		m1.disp('a');
		m1.disp('a',10);
		m1.callme();
		
		 methodoverloading4 m2=new  methodoverloading4 ();
		 m2.display();
	}

}
