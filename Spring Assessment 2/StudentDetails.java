package com.spring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentDetails {
	
	public void displayDetails(Student stud){
		System.out.println("Student details  :   ") ; 
		System.out.println("Student id  :   " + stud.getStudentId()) ;
		System.out.println("Student name  :   " + stud.getStudentName() ) ; 
		
		if(stud.getStudentTest1().getTestMarks() != 0)
			System.out.println("Student test 1 details : " + stud.getStudentTest1().getTestId() + " " +  stud.getStudentTest1().getTestTitle() + "  " +  stud.getStudentTest1().getTestMarks()) ;
		else
			System.out.println("Core java test not attended by " + stud.getStudentName());
		
		if(stud.getStudentTest2().getTestMarks() != 0)
			System.out.println("Student test 2 details : " + stud.getStudentTest2().getTestId() + " " +  stud.getStudentTest2().getTestTitle() + "  " + stud.getStudentTest2().getTestMarks()) ;
		else
			System.out.println("Spring test not attended by " + stud.getStudentName());
	}
	
	public void setStudentInfo(Student student , Test test1 , Test test2) {
		
		List<Student> studentList = new ArrayList<Student>();
		
		student.setStudentId("S001");
		student.setStudentName("Priya");
		student.setStudentTest1(setTestInfo(student.getStudentId(), "T001" , test1 , test2 ));
		student.setStudentTest2(setTestInfo(student.getStudentId(), "T002" , test1 , test2));
		
		studentList.add(student);
		displayDetails(student) ;
		
		student.setStudentId("S002");
		student.setStudentName("Dharshini");
		student.setStudentTest1(setTestInfo(student.getStudentId(), "T001" ,  test1 ,  test2));
		student.setStudentTest2(setTestInfo(student.getStudentId(), "T002" ,  test1 ,  test2));
		
		studentList.add(student);
		displayDetails(student) ;
	}
	
	public Test setTestInfo(String id, String testId , Test test , Test test1) {
		
		test.setTestId("T001");
		test.setTestTitle("Core Java");
		
		test1.setTestId("T002");
		test1.setTestTitle("Spring");
		
		if(id == "S001") {
			if(testId == "T001") {
				test.setTestMarks(80);
				return test;
			}
			if(testId == "T002") {
				test1.setTestMarks(0);
				return test1;
			}
		}
		
		if(id == "S002") {
			if(testId == "T001") {
				test.setTestMarks(100);
				return test;
			}
			if(testId == "T002") {
				test1.setTestMarks(90);
				return test1;
			}
		}
		
		return null;
		
	}

}
