package day18.condition;

public class Ifcondition {

	public static void main(String[] args) {
		int num1=45, num2=30;
		if(!(num1==num2))   {
			System.out.println("number1 is greater than numbers2");
		}else {
			System.out.println("number1 is smaller than numbers2");
		}
        if (num1>num2)  {
        	System.out.println("number1 is greater than numbers2");
		}else {
			System.out.println("number1 is smaller than numbers2");
		}
        if ( num1>= num2)  {
        System.out.println("number1 is either equal to numbers2 or greater than numbers");
	}else {
		System.out.println("number1 is smaller than numbers2");
	}
        
        if(num1==num2 || num1>num2)  {
        	 System.out.println("number1 is either equal to numbers2 or greater than numbers");
    	}else {
    		System.out.println("number1 is smaller than numbers2");
    		
    	}
        int sub1=50,sub2=30;
        if(sub1>35  &&  sub2>35)  {
        	System.out.println("pass...");
        }else {
        	System.out.println("fail..");
        }
        
        }
        }
	


