package day16.Assignment;

public class vowells {

	public static void main(String[] args) {
		vowells.getvowel('o');
		vowells.getvowel('h');
	}public static char getvowel(char alphabet)  {
		  if (alphabet =='a'||alphabet =='e'|| alphabet =='i' || alphabet =='o' || alphabet =='u'||
				  alphabet =='A'||alphabet =='E'|| alphabet =='I' || alphabet =='O' || alphabet =='U') {
			  System.out.println(alphabet +"is a vowel");
			  
		  }
		  else {
			  System.out.println(alphabet +"is a constant");
			  
		  }
		  return alphabet;
	}

}
