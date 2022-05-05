package day21.This;
class Student {

	
		int rollno;
		float fee;
		
		Student(int rollno,float fee) {
			rollno=rollno;
			fee=fee;
		}
		void display()  {
			System.out.println(rollno+""+fee);
		}
	}
  class Thiskeyword1 {
	  public static void main(String[] args) {
		  Student s1=new  Student(101,4000f) ;
		  Student s2 =new   Student(102,6000f);
		  s1. display();
		  s2 .display();
  }
}
