package day16.Assignment;

public class pallendrome {

	public static void main(String[] args) {
		int r,sum=0,num;
		int n =454;
		
		num=n;
		   while (n>0)  {
			   r=n%10;
			   sum=(sum*10)+r;
			   n=n/10;
		   }
         if (num==sum)
        	 System.out.println("there is pallendrome number");
         else
        	 System.out.println(" not pallendrome number");
	}

}
