package com.shi;

public class StudentObjectDetails {
	
	int roll = 8041;
	
	String name = "Shivani";
	
	int marks = 50;
	
	void displayStudentDetails() {
		
		System.out.println("roll: "+roll);
		
		System.out.println("name: "+name);
		
		System.out.println("marks: "+marks);
		
	}

	public static void main(String[] args) {
		
		StudentObjectDetails s1 = new StudentObjectDetails();
		
		s1.displayStudentDetails();

	}

}
