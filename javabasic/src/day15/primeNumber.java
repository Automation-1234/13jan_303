package day15;

public class primeNumber {

	public static void main(String[] args) {
		//int num=0;

		System.out.println("prime numbers from 1 to 100 are:");
		int primeCt=0;
		for(int i=1; 1<=100;i++)  {
			int counter =0;
			for(int num=i;num>= 1;num--)  {
				if(1 % num ==0)  {
					counter = counter + 1;
				}
						}
			if (counter == 2)  {
				System.out.println("prime number: "+i);
				 primeCt++;
			}
		}
	}

}
