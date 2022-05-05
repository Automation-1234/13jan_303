package day11.methodoverLoaing;

public class TotalRecallConcepts {
	static int age = 25; //static global variable
	double salary=40000;//non static global variable
	
	public static void main(String[] args) {
		int num1 = 13,num2 = 34,result;//local variable
		result = num1+num2;
		System.out.println("program starts....");
		System.out.println("Age is: "+TotalRecallConcepts.age);//access static variable
		TotalRecallConcepts s1=new TotalRecallConcepts();//create object
		System.out.println("salary is: "+s1.salary);//access non static variable
		System.out.println("result is: "+result);//access local variable
		
		("geneInterest is: "+TotalRecallConcepts.simpleinterest(25000, 5.0, 60));//access
		
		TotalRecallConcepts a1=new TotalRecallConcepts();//creating objectTo fot static method
		System.out.println("Addition is: "+a1.getaddition(20, 15));//access non static method
}
	

	}
	static public void square() {//static overloading method
		
	System.out.println("method with integrer");	}
    static public void square(int num1,int num2) {
			int res=num1*num2;
			System.out.println("method with integer argument:"+res);
		}
		static public void square(double num1,int num2) {
			double res=num1*num2;
			System.out.println("method with double argument:"+res);
		}	
		int addnumber(int num1,int num2) {//non static overloading method
			return num1+num2;
		}
		double addnumber(int num1,int num2, int num3) {
			return num1+num2+num3;	
		}	
			double addnumber(int num1,double num2,int num3) {
				return num1+num2+num3;
			}
			
			 TotalRecallConcepts.Square(); {//access static overloading method
			TotalRecallConcepts.square(23,8);     
			TotalRecallConcepts.square(6,45);
	
			TotalRecallConcepts a1=new TotalRecallConcepts();//creating object nonstatic overloading method
			System.out.println("sum1: "+a1.addnumber(45,23));
			System.out.println("sum2: "+a1.addnumber(7,8,9));
			System.out.println("sum3: "+  a1.addnumber(27,5.6,66));
			
			System.out.println("program ends...");
}

				
			public static double simpleinterest(int p,double r,int t) {
				return (p*r*t)/100;//static method
			}
			
			public int getaddition(int num1,int num2)  {
			  return num1+num2;
			
			}		
			
						
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}


