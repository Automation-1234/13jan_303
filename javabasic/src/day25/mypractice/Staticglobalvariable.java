package day25.mypractice;

public class Staticglobalvariable {
       static int age=45;
       static double salary=66666;
	public static void main(String[] args) {
		System.out.println("Program starts");
        System.out.println("SGV with standard:"+ Staticglobalvariable.age);
        System.out.println("SGV with standard salary=:"+Staticglobalvariable.salary);
        age=30;
        System.out.println("SGV with standard:"+Staticglobalvariable.age);
        
       int age=50;
        System.out.println("SGV with standard:"+Staticglobalvariable.age);
	}

}
