package day16.Assignment;

public class factorpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=12;
       int factor =0;
       for(int i=1; i<=a;i++)  {
    	 if(a%i==0)   {
    		 factor++;
    	 }
       }
    	 System.out.println("this is factor"+factor);
       }
	}


