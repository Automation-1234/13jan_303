package day6.methodOverloading;



public class methodoverloading5 {
  void disp(int a,double b)  {
	 System.out.println("method A");
  }
  void disp(int a,double b,double c)  {
		 System.out.println("method B");
  }
  void disp(int a,float b)  {
		 System.out.println("method c");
  }
	public static void main(String[] args) {
		methodoverloading5 obj =new methodoverloading5() ;
            obj.disp(100, 20.67f);
            obj.disp(100, 44.44,55.55);
	}

}
