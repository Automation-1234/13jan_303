package day12.operators;

public class Relatiop {

	public static void main(String[] args) {
		int num1=19,num2=14;
		System.out.println("num1: "+num1 +"--->num2:"+num2);
		
		boolean res = (num1 == num2);
		System.out.println("num1 == num2 : "+ res);
		
		System.out.println("num1 == num2 :" +(num1 == num2));//equal to
		
		System.out.println("num1 != num2 :" +(num1 != num2));//not equal to
		
		System.out.println("num1 > num2 :" +(num1 > num2));//greater than
		
		System.out.println("num1 >= num2 :" +(num1 >= num2));//greater than equal to
		
		System.out.println("num1 <= num2 :" +(num1 <= num2));//less than equal to
	}

}
