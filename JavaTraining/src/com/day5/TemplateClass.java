package com.day5;

import java.util.ArrayList;
import java.util.List;

public class TemplateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<>();
	//	List<String> li = new ArrayList<String>();
	// 3 ways to create 	List<String> li = new ArrayList();
		li.add("hi");
		li.add("hello");
		li.add("hi hello");
		
		System.out.println(li);
		Template<String> tt = new Template();
		System.out.println(tt.display("hello"));                                                                                
	}

}

class Template<T>{
	T a;
	public T display(T b) {
		a=b;
		System.out.println(a);
		return a;
	}
}
