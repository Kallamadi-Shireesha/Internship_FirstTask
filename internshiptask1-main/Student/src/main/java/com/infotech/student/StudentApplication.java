package com.infotech.student;


import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.infotech.student.entities.Student;
import com.infotech.student.service.StudentService;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext applicationContext=SpringApplication.run(StudentApplication.class, args);
	 StudentService studentService=applicationContext.getBean("studentService",StudentService.class);
/*
	ArrayList<Student> student= new ArrayList<>();
	student.add(new Student(1,"siri","pune"));
	student.add(new Student(2,"anii","hyd"));
	student.add(new Student(3,"ammu","atp"));
	studentService.createStudent(student);
	
	*/
	Student student = new Student();	 
	student.setClassid(1);
	student.setName("siri");
	student.setLocation("america");	
	student.setSubjects(Arrays.asList("hindi", "english", "maths"));
	studentService.createStudent(student);
	
	Student student1 = new Student();
	student1.setClassid(2);
	student1.setName("ani");
	student1.setLocation("kaki");
	student1.setSubjects(Arrays.asList("hindi", "english"));
	studentService.createStudent(student1);
	
	
	Student student2 = new Student();
	student2.setClassid(3);
	student2.setName("an");
	student2.setLocation("delhi");	
	student2.setSubjects(Arrays.asList("hindi", "english","social"));
	studentService.createStudent(student2);
	
	Student student3 = new Student();
	student3.setClassid(4);
	student3.setName("ammu");
	student3.setLocation("bang");
	student3.setSubjects(Arrays.asList("maths","hindi", "english"));
	studentService.createStudent(student3);
	
	Student student4 = new Student();
	student4.setClassid(5);
	student4.setName("ayush");
	student4.setLocation("hyd");	
	student4.setSubjects(Arrays.asList("telugu", "english"));
	studentService.createStudent(student4);
	
	
	Student student5 = new Student();
	student5.setClassid(6);
	student5.setName("aradhya");
	student5.setLocation("atp");	
	student5.setSubjects(Arrays.asList("ecomonics","hindi", "english"));
	studentService.createStudent(student5);
}
}