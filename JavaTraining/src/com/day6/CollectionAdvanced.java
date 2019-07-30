package com.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		List list1 = Arrays.asList("alpha", "beta", "gamma", "delta", "hell", "exception", "the");
		list1.add("no");
		Iterator it = list1.iterator();                                                                                                                                                                               
		
		
		
		list1.add("hell");						//using iterator throws UnsupportedOperationException
		while(it.hasNext()) {
			System.out.println("" + it);
		}
		
		
		System.out.println(list1);
		list.addAll(list1); //to add list in list
		list.add("hello");
		Collections.sort(list1);
		System.out.println(list);                                 
		
		
		Set newSet = new HashSet();
		newSet.add("hi");
		newSet.add("hi");
		newSet.add(list1);
		System.out.println(newSet);                  
		
		list1.add(newSet);
		System.out.println(list1); 
		
		

	}

}
