package day25.mypractice;
class fruit {
	fruit() {
		System.out.println("fruit class constructor..");
	}
	public void taste() {
		System.out.println("fruits are sweets..");
	}
}

class apple extends fruit {
	apple() {
		System.out.println(" apple class constructor...");
	}
	public void shape () {
		System.out.println(" apple is round...");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
	apple fr = new apple();
	fr.taste(); //call method parent class
	fr.shape();

	}

}
