package day4.localGlobleVariable;

public class FinalVariable {

	public static void main(String[] args) {
	final int empId = 234;
		System.out.println("EmpId: "+empId);
      //  empId=345;compile time error
		 empId=333;//compile time error
        System.out.println("EmpId: "+empId);
	}

}
