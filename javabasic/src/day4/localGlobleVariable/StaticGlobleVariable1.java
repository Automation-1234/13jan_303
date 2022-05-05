package day4.localGlobleVariable;

public class StaticGlobleVariable1 {
    static int age=25;
    static double  salary =40000;
    public static void main(String[] args) {
    	System.out.println("program starts");
    	System.out.println("SGV:"+age);
    	System.out.println("SGV with standard:"+StaticGlobleVariable1.age);
    	System.out.println("SGV:"+salary);
    	
     age = 30; //updating value of age variable
         double salary =60000;
    	System.out.println("SGV:" +age);
    	System.out.println("SGV with standard:"+StaticGlobleVariable1.age);
        System.out.println("SGV:"+salary);
        
       int age=45; //local variable
        System.out.println("local variable :" +age);
        System.out.println("SGV with standard:"+StaticGlobleVariable1.age);
        System.out.println("program ends");
	}

}
