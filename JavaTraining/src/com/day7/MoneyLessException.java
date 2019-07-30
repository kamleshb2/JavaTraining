package com.day7;

public class MoneyLessException extends Exception{   //for checked exception, extend to Exception

	public MoneyLessException() {
		
	}
	
	public MoneyLessException(String msg) {
		super(msg);
	}
}
