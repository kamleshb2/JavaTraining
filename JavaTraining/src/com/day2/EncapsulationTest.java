package com.day2;

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		System.out.println(st.studentID);
		//System.out.println(st.password); 
		System.out.println(st.getPassword());
		st.setPassword("abc123");
		System.out.println(st.getPassword());//after modifying
		
		Student st1 = new Student();
		System.out.println(st1.getPassword()); //DUMMY GET PRINTED BECAUSE OF INITIAL COPY
		
		Student st2 = new Student(123, "ragu");
		//password is wrong, st2 = new Student(123, "raghu"); //will create new memory 
		
		System.out.println(st1); //by default calls toString()
		System.out.println();

	}

}

//human, 
//primate - jump, eat, walk


class Student{
	
	
	int studentID=0; //default access - any class within package
	private String password = "dummy"; //private access
	
	public Student() {
		
	}
	
	
	public Student(int studentID, String password) {
		this.studentID = studentID;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}