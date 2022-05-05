package day16.Assignment;

public class palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a= 234;
       int r;
       int sum =0;
       int temp=a;
       
       for(;a>0; a=a /10)  {
    	   
    	   r=a%10;
    	   sum=(sum*sum)+r;
       }
    	   if(sum==temp) {
    		   System.out.println("this is palindrome"+sum);
    	   }else {
    		   System.out.println("this is not palindrome"+sum);
    	   }
    		   
       }
	}


