package day20Constructor;

public class Cons2 {
	
	int roll;
	double salary;
	Cons2(int r,double s)  {
		roll=r;
		salary =s;
	}
	void display() {
		System.out.println(roll+" "+salary);
	}

	public static void main(String[] args) {
		 Cons2 c1 = new Cons2(101,250045.45 );
		 c1.display();
		 Cons2 c2=new Cons2(201,550045.45);
           c2.display();
	}

}
