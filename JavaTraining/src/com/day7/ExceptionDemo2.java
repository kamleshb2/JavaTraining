package com.day7;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		
//		Date d = new Date();           //shows date in full format
//		System.out.println(d);
//		LocalDate l = LocalDate.now();  //shows only date
//		l = LocalDate.of(2019, Month.JUNE, 30);
//		System.out.println(l);
//		System.out.println(l.isLeapYear());   //to check whether leap year
		
//		Random rand = new Random();
//		int i = rand.nextInt(1000);		to generate random number using random class 
//		System.out.println(i);
		
		
		
		int amt = 0, dbBalance=5000;
		amt = new Scanner(System.in).nextInt();
		try {
			check(amt);										//UI Layer
		}catch(MoneyLessException e) {
		System.out.println(e.getMessage());

	}
	}
	
	static void check(int amt) throws MoneyLessException{
		int dbBalance=5000;
		if(amt<500) {
			throw new MoneyLessException("Please Enter Amount greater than 500");// it'll pass to main method
		}
		else {
			System.out.println("withdrawn successfully");			//Service Layer
		}

	}
	
	//modularize
	//getAmout() -- use scanner here

}
