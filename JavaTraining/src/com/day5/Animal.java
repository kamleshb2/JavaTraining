package com.day5;

abstract class Animal {
	
	public void walk() {
		System.out.println("I can walk!");
	}
	
	public void run() {
		System.out.println("I can run");
	}
	
	public abstract void fly();
	public abstract void isDead();
	
}


class Sparrow extends Animal{
	public void fly() {
	
		System.out.println("I can fly ");
	}
	
	public void isDead() {
		System.out.println("I'm alive, not dead bitches!!");
	}
	
	
}

class Dog extends Animal{
	public void fly() {
		System.out.println("I can't fly");
	}
	
	public void isDead() {
		System.out.println("I'm alive");
	}
}

class TestAbstract {
	public static void main(String[] args) {
		Sparrow s = new Sparrow();
		//s = null;
		s.walk();
	}
}
