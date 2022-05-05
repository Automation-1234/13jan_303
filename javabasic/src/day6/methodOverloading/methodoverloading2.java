package day6.methodOverloading;

public class methodoverloading2 {
    public void square() {
    	System.out.println("no paramter method called");
    }
    public void square(int number) {
    	int square=number*number;
    	System.out.println("method which integer arguent:"+square);
    }
    public void square(float number) {
    	float square=number*number;
    	System.out.println("method which float arguent:"+square);
    }
	public static void main(String[] args) {
		methodoverloading2 m1=new methodoverloading2();
		m1.square(40);
		m1.square();
		m1.square(45f);
	}

}
