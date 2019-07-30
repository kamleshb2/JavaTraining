package com.day3;

class Human extends Primate {
	
	public void think() {
		System.out.println("I CAN THINK!");
	}
	
	public void talk() {
		System.out.println("I can Talk !!!!");
	}
	
	@Override
	public void walk() {
		System.out.println("Overriding walk method of primate");
	}

}
