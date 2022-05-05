package day7.operators;

public class logicalop2 {

	public static void main(String[] args) {
		int age=20;
		char blgrp='B';
		boolean res1,res2;
		res1=(age>20);
		res2=(blgrp=='B');
		System.out.println("Result1:"+res1);
        System.out.println("Result2:"+res2);
        
        System.out.println("bool1&&bool2="+(res1&&res2));
	}

}
