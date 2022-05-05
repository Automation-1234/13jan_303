package methodoverloading;

public class methodoverloading4 {

	public static void main(String[] args) {
		methodoverloading4 m1=new methodoverloading4();
		System.out.println("sub: "+m1.substraction());
		System.out.println("sub: "+m1.substraction(40,20));
        m1.display();
	}
	void display()  {
		System.out.println("i am jalgaon");
	}
         int substraction()  {
        	 int num1=30,num2=10;
        	return num1-num2;
        	 
         }
         int substraction(int num1,int num2)  {
        	 return num1-num2;
         }
}
