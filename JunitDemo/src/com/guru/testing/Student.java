package com.guru.testing;

public class Student {
	
	private static Student student;
	private Student()
	{
		
	}
	public static Student getInstance()
	{
		if(student==null)
		{
		student= new Student();
		}
		return student;
	}
	public void display()
	{
		System.out.println("From Display");
	}
	public static void main(String[] args) {
		Student s=Student.getInstance(); s.display();
	}

}
