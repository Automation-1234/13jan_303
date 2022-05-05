package day4.localGlobleVariable;

public class Variable {
	double salary;
	static char grade;
	int age=27;
    static int empId=123;
	public static void main(String[] args) {
		
		System.out.println("program starts");
		int empId=456;
		System.out.println("SGV  empId with std: "+empId);//456
		System.out.println("SGV grade with std:"+Variable.grade);
		System.out.println("SGV grade with std:"+grade);
		System.out.println("SGV  empId with std: "+ Variable.empId );//123
		
		Variable v1=new Variable();
		System.out.println("NSGV with std:"+v1.salary);//o.o
		System.out.println("NSGV with std:"+v1.age);//27
		
		Variable v2=new Variable();
		v2.salary=5555;
		v2.age=23;
		System.out.println("NSGV with std:"+v2.salary);//5555
		System.out.println("NSGV with std:"+v2.age);//23
		System.out.println("program ends");
	}

}
