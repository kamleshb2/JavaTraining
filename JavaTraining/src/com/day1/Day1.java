package com.day1;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int res=0;
		
		for(int i=1; i<=num2; i++) {
			res = num1 + res ;
		}
		
		System.out.println(res);
		
	}

}
