package com.day4;

import java.util.Scanner;

class Calculator {
	
	public void calSum(double a, double b) {
		double ans = a + b;
		System.out.println(" " + ans);
	}
	public void calSum(long a, long b) {
		long ans = a + b;
		System.out.println(" " + ans); 
		
			
		}
	
}


public class PolyStat{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter numbers to add: ");
		String a = scn.next();
		String b = scn.next();
		Calculator c = new Calculator();
		
		if(a.contains(".") || b.contains(".")) {
			double num1 = Double.parseDouble(a);
			double num2 = Double.parseDouble(b);
			c.calSum(num1, num2);
		}
		else {
			long num1 = Long.parseLong(a);
			long num2 = Long.parseLong(b);
			c.calSum(num1, num2);
		}
		
	}
}