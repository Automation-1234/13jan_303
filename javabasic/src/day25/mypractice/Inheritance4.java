package day25.mypractice;
   class Vehicle {
	   public void wheels() {
		   System.out.println("I have wheels");
	   }
   }
   class bike extends Vehicle {
	   public void countwl() {
		   System.out.println(" i am a bike and has 2 wheels");
	   }
   }
   class carl extends Vehicle {
	   public void countwlc() {
		   System.out.println(" i am a car and has 4 wheels");
	   }
   }
   class schooter extends Vehicle {
	   public void countwls() {
		   System.out.println( " i am a schooter and has 2 wheels");
	   }
   }
public class Inheritance4 {

	public static void main(String[] args) {
		schooter sc= new schooter();
		sc.wheels();
		

	}

}
