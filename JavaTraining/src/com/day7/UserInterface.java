package com.day7;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scn = new Scanner(System.in);) {
			int number = scn.nextInt();
			ValidLayer.check(number);

		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}

	}

}


class ValidLayer{
	static void check(int number) throws NegativeNumberException {
		if(number<0) {
			throw new NegativeNumberException("Number should be positive");
		}
		
		
	}
}
