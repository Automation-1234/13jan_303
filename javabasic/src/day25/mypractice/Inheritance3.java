package day25.mypractice;
class fourwheeler {
	
	public void wheels() {
		System.out.println("i have four wheels");
	}
}

  class car extends fourwheeler   {
	  
	  public void type () {
		  System.out.println("i am a car");
	  }
  }
  class maruti extends car {
	  public void company () {
		  System.out.println("I am maruti");
	  }
	  
  }
public class Inheritance3 {

	public static void main(String[] args) {
		maruti fr =new maruti();
		fr.wheels();
		fr.type();
		fr.company();

	}

}
