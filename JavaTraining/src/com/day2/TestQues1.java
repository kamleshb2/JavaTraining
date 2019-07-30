package com.day2;

public class TestQues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TV t1 = new TV();
//		t1.switchOn();
//		t1.switchOff();
//		t1.prevChannel();
//		t1.nextChannel();
//		
//		Radio r1 = new Radio();
//		r1.switchOn();
//		r1.switchOff();
//		r1.prevFrequency();
//		r1.nextFrequency();
//		
//		Projector p1 = new Projector();
//		p1.switchOn();
//		p1.switchOff();
//		p1.brightness();
//		p1.hdmiSource();
//		p1.vgaSource();
		
		ElectronicAppliance el =  new Radio();
		el = new Radio();
		el.switchOn();
		el.switchOff();//calls method in base 
		el.prevFrequency(); //won't work 
		
		//Radio r = (Radio) el;//down casting
		//r.prevFrequency();//valid
		
		//good practice
		
		if(el instanceof Radio) {
			Radio r = (Radio) el;
			r.prevFrequency();
		}
		else {
			TV t = (TV) el; //unique method of TV class
		}
		
		
		
		

	}

}
