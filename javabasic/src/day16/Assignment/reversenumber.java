package day16.Assignment;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=1234567;
        int reverse=0;
        
        for(;n!=0;n/=10)   {
        	int rem=n%10;
        	reverse=reverse*10+rem;
        	
        	
        }
        System.out.println(reverse);
	}

}
