package methodoverloading;

public class methodoerloading2 {

	public static void main(String[] args) {
		System.out.println("sum:"+addNumbers());
        System.out.println("sum:"+addNumbers(22,45));
        System.out.println("sum:"+addNumbers(10,10,10));
        System.out.println("sum:"+addNumbers(22,45));
	}
    static int addNumbers()  {
    	int num1=10,num2=20;
    	return num1+num2;
    }
    static int addNumbers(int num1,int num2)  {
    	
    	return num1+num2;
}
 static int addNumbers(int num1,int num2,int num3)  {
    	
    	return num1+num2+num3;
}
}
