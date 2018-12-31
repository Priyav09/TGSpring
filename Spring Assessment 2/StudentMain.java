package com.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student stu = app.getBean(Student.class );
		Test test = app.getBean(Test.class);
		Test test1 = app.getBean(Test.class);

		StudentDetails sd = app.getBean(StudentDetails.class);			
		sd.setStudentInfo(stu , test , test1);
		
	}
}
