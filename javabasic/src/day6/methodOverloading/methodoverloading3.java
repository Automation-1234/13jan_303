package day6.methodOverloading;
  class Adder  {
	  static int add (int a,int b) {
		  return a+b;
	  }
	  static int add (int a,int b,int c) {
		  return a+b+c;
  }
	  public static void main(String[] args) {
		  System.out.println(add(44,55));
		  System.out.println(add(44,55,88));
	  }
  }
public class methodoverloading3 {
  static void display() {
	  System.out.println("i am display() methodoverloading3 of cass");
  }
	public static void main(String[] args) {
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(11,11,11));
		methodoverloading3.display();
	}

}
  
