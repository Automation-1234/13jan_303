package day7.operators;

public class logicalop {

	public static void main(String[] args) {
		int age=19;
		char blgrp='A';
		boolean res1,res2;
		res1=(age>18);
		res2=(blgrp=='A');
		System.out.println("Result1:"+res1);
        System.out.println("Result2:"+res2);
        
        System.out.println("bool1 && bool2="+(res1&&res2));
        
        System.out.println("bool1 || bool2="+(res1||res2));
        
        System.out.println("!(bool1 && bool2)="+!(res1&&res2));//logical not
	}

}
