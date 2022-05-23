package com.Question2;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails(int courseId,String courseName,int courseFee) {
		
		System.out.println("The Course ID is :"+courseId);
		System.out.println("The Course Name is :"+courseName);
		System.out.println("The Course Fee is :"+courseFee);
		
	}
	
	static void authenticate(String username, String password) {
		
		if((username=="Admin") && (password=="1234"))
		{
			Course c = new Course();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Course ID :");
			c.courseId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Course Name :");
			c.courseName = scanner.nextLine();
			System.out.println("Enter Course Fee :");
			c.courseFee = scanner.nextInt();
			
			c.displayCourseDetails(c.courseId,c.courseName,c.courseFee);
			

		}
		else
		{
			System.out.println("Invalid Username or password");
		}
	}

	public static void main(String[] args) {
		
		authenticate("Admin","1234");
		authenticate("A","12");
		
		
	}

}
