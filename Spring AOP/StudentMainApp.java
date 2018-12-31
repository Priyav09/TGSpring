package com.spring;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class StudentMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentMainApp studentMain = app.getBean(StudentMainApp.class);
		Student[] stud = new Student[101];
		
		for(int i = 1; i <= 100 ; i++) {
			stud[i] = app.getBean(Student.class);
			stud[i].setStudentId("S"+i);
			stud[i].setStudentName("Student"+i);
			stud[i].setAddress("address"+i);
		}
		
		System.out.println("---------------Displaying all student details --------------------\n");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Student ID\t\t" + "Student Name\t\t" + "Student Address");
		System.out.println("------------------------------------------------------------------");
		studentMain.getAllDetails(stud);
		System.out.println("**************************************************************************************************"+"\n");
		System.out.println("---------------Displaying student details with provided id -----------------\n");
		
		studentMain.getDetails(stud, "S54");
		System.out.println("**************************************************************************************************");
	}
	
	protected void getAllDetails(Student[] student) {
		long start = System.currentTimeMillis();
		
		 for(int i = 1; i <= 100 ; i++) {
			System.out.println(" "+student[i].getStudentId() + " \t\t\t" +student[i].getStudentName() + " \t\t" + student[i].getAddress());
		 }
		 System.out.println();
		 long totalTime = System.currentTimeMillis() - start;
		 System.out.println("Total time taken to display all student details : " + totalTime + " ms");
	}
	
	protected void getDetails(Student[] student , String studentId) {
		
		long start = System.currentTimeMillis();
		
		for(int i = 1; i <= 100 ; i++) {
			if((student[i].getStudentId()).equalsIgnoreCase(studentId)){
				System.out.println("The details of student with id " + i + " :");	
				System.out.println("------------------------------------------------------------------");
				System.out.println("Student ID\t\t" + "Student Name\t\t" + "Student Address");
				System.out.println("------------------------------------------------------------------");
				System.out.println(" "+student[i].getStudentId() + " \t\t\t" +student[i].getStudentName() + " \t\t" + student[i].getAddress());
			}
		}
		 System.out.println();
		
		long totalTime = System.currentTimeMillis() - start;
		System.out.println("Total time taken to display only specified student details : " + totalTime + " ms");
		
	}

} 
