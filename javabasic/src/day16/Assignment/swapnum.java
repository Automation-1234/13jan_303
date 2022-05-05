package day16.Assignment;

public class swapnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1 = 20;
       int num2 =40;
       int swap=num1+num2;
       num2=swap-num1;
       num1=swap-num2;
       
       System.out.println("after swapping value of num1:"+num2);
       System.out.println("after swapping value of num1:"+num1);
	}

}
