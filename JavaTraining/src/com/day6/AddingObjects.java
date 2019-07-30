package com.day6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AddingObjects {

//	@SuppressWarnings({"unchecked", "rawtypes"}) //to supress yellow colored warnings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Set setData = new HashSet();
		setData.add(car);
		setData.add(car);
		
		System.out.println(setData);

		System.out.println(setData.size());
		
		setData.add(new Car());
		setData.add(new Car());
		
		System.out.println(setData);

		System.out.println(setData.size());
		
//		Set<String> data = new HashSet<String>();   doesn't show yellow line because data is specified, in above case
//		data.add("hello");							there is heterogenous data, by default takes a object if not specified
		
		//set to hold vehicle object only
		
		Set<? super Vehicle> data = new HashSet<Vehicle>(); //? is wildcard, when used extends gives error, use super
		data.add(new Car());								//read as Car is a subclass of vehicle, not as car extends vehi
		data.add(new Bus());
		data.add(new Vehicle());
		System.out.println(data.size());
		
		
		List<String> l1 = new ArrayList<String>();   //we can add only String type as an argument 
		l1.add("hello");
		
//		List<Object> list1;
//		List<List<>> list2;				//invalid
//		List<List> list3;				different ways to define list of lists
//		List<List<Object>> list4;
		
		//concurrent modification exception, creates problem in multithreaded applications
		
		data.add(new Car());								
		data.add(new Bus());
		Iterator it = data.iterator();   //creates iterator when 2 data values are added 
		data.add(new Vehicle());
		while(it.hasNext()) {
											//throws concurrentmodificationexception
		}
		
		//concurrentaccessexception
		
	
		
		

	}

}

class Vehicle{
	
}

class Car extends Vehicle{
	
}

class Bus extends Vehicle{
	
}
