package com.day3;

import java.util.Scanner;

public class IPcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the IP: ");
		String IP = scn.next();
		boolean flag = false;
		
		String[] check = IP.split("[.]");
		int[] number = new int[4];
	
		for(int i=0; i<check.length; i++) {
			number[i] = Integer.parseInt(check[i]);
			if(number[i]>255 || number[i]<0) {
				flag = false;
				break;
			}
			else {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("Valid IP");
		}
		else {
			System.out.println("Invalid IP"); 
			
		}
		
		
		
		
		
	}

}
