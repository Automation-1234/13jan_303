package day25.mypractice;

public class Method5 {

	public static void main(String[] args) {
	System.out.println("program starts...");
	Method5 m1=new Method5();
	m1.display();
	m1.display('B',33,5555);
	m1.display('N',66,8888);
	System.out.println("program ends...");

	}
      void display() {
    	  char grade='A';
    	  int age=50,salary=45000;
    	  System.out.println("Grade is:"+grade);
    	  System.out.println("age is :"+age);
    	  System.out.println("salary is:"+salary);
      }
      void display(char grade,int age,int salary) {
    	 
    	  System.out.println("Grade is:"+grade);
    	  System.out.println("age is :"+age);
    	  System.out.println("salary is:"+salary);
}
}