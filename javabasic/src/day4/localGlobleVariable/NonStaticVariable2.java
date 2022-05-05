package day4.localGlobleVariable;

public class NonStaticVariable2 {
    int mobileNum=1234;
    double grade;
	public static void main(String[] args) {
		System.out.println("program starts...");
		System.out.println("********r1 object*******");
		
		NonStaticVariable2 r1=new NonStaticVariable2();
		System.out.println("mobilenumber with r1 reference "+r1.mobileNum);
		System.out.println("grade with r1 reference "+r1.grade);
		System.out.println("********x1object*******");
		
		NonStaticVariable2 x1=new NonStaticVariable2();
		System.out.println("mobilenumber with x1 reference "+x1.mobileNum);
		System.out.println("grade with x1 reference "+x1.grade);
		
		System.out.println("******** updated x1object variable*******");
		x1 .mobileNum=567;
		x1.grade='A';
		
		System.out.println(" updateded ,mobilenumber with x1 reference "+x1.mobileNum);
		System.out.println("updateded, grade with x1 reference "+x1.grade);
		System.out.println("********r1 object*******");
		System.out.println("mobilenumber with r1 reference "+r1.mobileNum);
		System.out.println("grade with r1 reference "+r1.grade);
		System.out.println("program ends");
		
		
		
		
		
		
	}

}
