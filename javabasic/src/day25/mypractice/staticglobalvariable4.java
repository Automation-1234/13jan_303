package day25.mypractice;

public class staticglobalvariable4 {
       static int age = 45;
       static double salary=55500;
      static  int empId=3456;
	public static void main(String[] args) {
	System.out.println("program starts...");
     System.out.println("SGV with standard:"+ staticglobalvariable4.age);
     System.out.println("SGV with standard:"+staticglobalvariable4.salary);
     System.out.println("SGV with standard:"+staticglobalvariable4.empId);
         
         int age=56;
         System.out.println("SGV with standard:"+age);
     
	}

}
