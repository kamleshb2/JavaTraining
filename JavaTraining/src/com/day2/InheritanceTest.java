package com.day2;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		human1.eat();
		human1.jump();
		human1.walk();
		human1.talk();
		human1.think();
		
		Primate p = new Primate();
				p.jump();
				p.walk();
		//		p.think();//error can't access methods of subclass

	}

}
