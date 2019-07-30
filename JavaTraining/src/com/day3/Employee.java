package com.day3;

public class Employee {
	static int count;
	Employee(){
		System.out.println("Parent class constructor is called");
		count++;
	}
}

class Admin extends Employee{
	Admin(){
	}
}

class Manager extends Employee{
	Manager(){
	}
}

class Security extends Employee{
	Security(){
	}
}

