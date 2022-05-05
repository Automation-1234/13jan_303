package day18.condition;

public class switchcase1 {

	public static void main(String[] args) {
		char ch ='e';
		switch (ch)  {
		case'e':
		System.out.println("value matched= e, a vowel");
		//break;
		
		case'a':
			System.out.println("value matched= a, a vowel");
			//break;
			
		case'w':
			System.out.println("value matched= w, a vowel");
		break;
			
		case'i':
			System.out.println("value matched= i, a vowel");
			break;
			
		default:
			System.out.println("Given character is not a vowel");
			break;
		}

	}

}
