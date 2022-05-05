package methodoverloading;

class displayoverloading  {
	public void disp(char c)  {
		System.out.println(c);
	}
	public void disp(char c,int num) {
		System.out.println(c+""+num);
	}
}

public class methodoverloading7 {

	public static void main(String[] args) {
		displayoverloading   obj=new displayoverloading  ();
		obj.disp('a');
		obj.disp('a',10);

	}

}
