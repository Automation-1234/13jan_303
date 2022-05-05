package day25.mypractice;

public class staticglobalvariable5 {
    int mobilenumber=1234;
    char grade;
	public static void main(String[] args) {
		System.out.println("program starts...");
		staticglobalvariable5 r1=new staticglobalvariable5 ();
		System.out.println("SGV with standard:"+r1.mobilenumber);
		System.out.println("SGV with standard:"+r1.grade);
		
		staticglobalvariable5 x1=new staticglobalvariable5 ();
		System.out.println("SGV with standard:"+x1.mobilenumber);
		System.out.println("SGV with standard:"+x1.grade);
		x1.mobilenumber=4567;
		x1. grade='A';
		System.out.println("SGV with standard:"+x1.mobilenumber);
		System.out.println("SGV with standard:"+x1.grade);
				
		System.out.println("SGV with standard:"+r1.mobilenumber);
		System.out.println("SGV with standard:"+r1.grade);
		
	}

}
