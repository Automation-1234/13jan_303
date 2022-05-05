package methodoverloading;

public class methodOverLoading1 {

	public static void main(String[] args) {
		System.out.println( checkfirstnumberislargestNumber (55,25));
		System.out.println( checkfirstnumberislargestNumber (15,25));
	}
       static boolean checkfirstnumberislargestNumber(int num1,int num2)  {
    	   boolean res=num1>num2;
    	   return res;
       }
}
