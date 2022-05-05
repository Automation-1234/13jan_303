package day16.Assignment;

public class PrimeNumberWhileloop {

	public static void main(String[] args) {
		int num=123, rev=0,rem;
		
		while(num!=0)   {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
			
			System.out.println("reverse number:"+rev);
			System.out.println("reverse number using method :"+getReverseNumber(123456789));
	}
	public static int getReverseNumber(int num)  {
	  int rev=0,rem;
	  while(num!=0);    {
		  rem=num%10; 
		  rev=rev*10+rem;
		  num=num/10;
			
		}
   return rev;
	}

}
