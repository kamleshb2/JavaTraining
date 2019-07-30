package com.day7;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Closeable;
import java.lang.AutoCloseable;

public class ExceptionDemo1 {
	
	static InputStreamReader isr = null;
	
	// java.io.Closeable extends java.lang.AutoCloseable
			//use of try with resources from java7 - eliminates finally blocks
	//arg passed to try block should be Autocloseable or Closeable
	//resources will be opened in same order but will be closed in reverse order
	//resources will implement AutoCloseable interface, they get close method using this interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try(InputStreamReader isr=new InputStreamReader(System.in); ) {  //try with resources
		try(A a = new A(); A ob1 = new A(); ){  //if exception is thrown by ob1, first a object will get closed 
			int ascii = isr.read();
			System.out.println((char)ascii);
		}
		catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
////		finally {
////			if(isr!=null) 
////			try{
////			isr.close();			//if object is null,  will throw nullPointerException
////			}catch(IOException e) {
////				
////			}
////			isr= null;
//		}
		System.out.println("Executed!");
		

	}

}

class A implements AutoCloseable

{

	@Override
	public void close() throws NullPointerException {
		// TODO Auto-generated method stub
		throw new NullPointerException();
		
	}
	
}

class B implements AutoCloseable

{

	@Override
	public void close() throws NullPointerException {
		// TODO Auto-generated method stub
		throw new NullPointerException();
		
	}
	
}
