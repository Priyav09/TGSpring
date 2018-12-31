package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	private String studentId ;
	private String StudentName ;
	
	@Autowired
	private Test studentTest1 ; 
	
	@Autowired
	private Test studentTest2 ;
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public Test getStudentTest1() {
		return studentTest1;
	}

	public void setStudentTest1(Test studentTest1) {
		this.studentTest1 = studentTest1;
	}

	public Test getStudentTest2() {
		return studentTest2;
	}

	public void setStudentTest2(Test studentTest2) {
		this.studentTest2 = studentTest2;
	}
	
	

	
}
