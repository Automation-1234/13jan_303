package day4.localGlobleVariable;

public class NonStaticVariable3 {
	
	int mobileNum=22546;
	char grade;

	public static void main(String[] args) {
		System.out.println("program starts");
		 NonStaticVariable3 r1=new  NonStaticVariable3(); //object create
         System.out.println("mobile with r1 reference:"+r1.mobileNum);
         System.out.println("grade with r1 reference:"+r1.grade);
         
         NonStaticVariable3 x1=new  NonStaticVariable3();
         System.out.println(x1.mobileNum);
         System.out.println(x1.grade);
         
         x1.mobileNum=657;     //updated 
         x1.grade='A';
         System.out.println(x1.mobileNum);
         System.out.println(x1.grade);
         
         System.out.println(r1.mobileNum);
         System.out.println(r1.grade);
         System.out.println("program ends");
	}

}
