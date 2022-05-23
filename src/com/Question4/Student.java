package com.Question4;

import java.util.Scanner;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	Student(){
		
	}
	
	Student(int rollNumber,String studentName,int marks){
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}
	

}

class Main {
	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Nuumber of students :");
		int n = s.nextInt();
		
		
		System.out.println("Roll Number");
		int rollNumber = s.nextInt();
		
		s.nextLine();
		
		System.out.println("Name");
		String studentName = s.nextLine();
		
		System.out.println("Marks");
		int marks = s.nextInt();
		
		Student s1 = new Student(rollNumber,studentName,marks);
		s1.getRollNumber();
		s1.getStudentName();
		s1.getMarks();
		
		
		
	}
	
}
