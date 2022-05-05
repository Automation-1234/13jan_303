package day4.localGlobleVariable;

public class StaticGlobleVariable3 {
        static int empId; //default value
		static double salary;
		static char grade;
		static boolean isprime;
		public static void main(String[] args) {
			System.out.println("program Starts....");
			System.out.println("EmpId: "+empId); 
			System.out.println("Salary: "+salary); 
			System.out.println("Grade: "+grade); 
			System.out.println("Isprime: "+isprime);
			int age=22;//mandatory to initialize
			System.out.println(age);
			System.out.println("program Ends...");
			
		}
	}


