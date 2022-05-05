package day25.mypractice;

public class staticglobalvariable6 {
      double salary;
      static char grade;
      int age=45;
      static int empId=456;
      
	public static void main(String[] args) {
		int empId=356;
		System.out.println("program starts...");
         System.out.println("SGV with std:"+staticglobalvariable6.grade);
         System.out.println("SGV with stndard:"+staticglobalvariable6.empId);
         System.out.println("local SGV with std:"+empId);
         

         staticglobalvariable6 r1=new staticglobalvariable6();
         System.out.println("SGV with std:"+r1.salary);
         System.out.println("SGV withstd:"+r1.age);
         
         staticglobalvariable6 x1=new staticglobalvariable6();
       x1.salary=40000;
       x1.age=20;
       System.out.println("SGV with std:"+x1.salary);
       System.out.println("SGV with std:"+x1.age);
	}

}
