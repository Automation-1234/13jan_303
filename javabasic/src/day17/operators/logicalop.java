package day17.operators;

public class logicalop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int age=19;
     char blgrp='A';
     boolean res1,res2;
     res1=(age>18);
     res2=(blgrp=='A');
     System.out.println("result1:"+res1);
     System.out.println("result2:"+res2);
     
     System.out.println("bool1 && bool2="+(res1 && res2));
     
     System.out.println("bool1 || bool2="+(res1 || res2));
     
     System.out.println("!(bool1 && bool2="+!(res1 && res2));
     
	}

}
