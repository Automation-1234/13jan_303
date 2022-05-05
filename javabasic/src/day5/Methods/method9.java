package day5.Methods;

public class method9 {

	
	private static method9 m1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("program starts...");
       method9.m1 = new method9();
       m1.display();
       m1.display('V',50,60000);
       m1.display('N',20,30000);
       System.out.println("program ends...");
	}
	  void display()  {
		  char grade= 'A';
		  int age=30;
		  int salary=40000;
		  System.out.println("Grade is:"+grade);
		  System.out.println("age is:"+age);
		  System.out.println("salary is:"+salary);
        
        }
	  void display(char grade,int age,int salary)  {
		  
		  System.out.println("Grade is:"+grade);
		  System.out.println("age is:"+age);
		  System.out.println("salary is:"+salary);
        
}
}
