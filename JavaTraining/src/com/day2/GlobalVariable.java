package com.day2;

public class GlobalVariable {
	int a=1;
	static int b=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("value of a is " + a);//problem
		//solution - create object
		
		GlobalVariable ob1 = new GlobalVariable();
		GlobalVariable ob2 = new GlobalVariable();
		GlobalVariable ob3 = new GlobalVariable();
		
		System.out.println("" + (++ob1.a)); //ans - 2
		System.out.println("" + (++ob2.a)); //ans - 2
		System.out.println("" + (++ob3.a)); //ans - 2
		
		System.out.println("" + (++ob1.b)); // 3
		System.out.println("" + (++ob2.b)); // 4
		System.out.println("" + (++ob3.b)); // 5
		
		
		
	}

}
