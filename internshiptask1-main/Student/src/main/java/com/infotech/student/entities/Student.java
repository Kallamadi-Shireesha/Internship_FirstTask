package com.infotech.student.entities;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student implements Comparable<Student> {

	@Id
	
	@Column(name="class")
	private Integer classid;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="location")
	private String location;
	@Column(name="subjects")
	 @ElementCollection(targetClass=String.class)
	private List<String> subjects;

	


	public Integer getClassid() {
		return classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	

	public Student(Integer classid, String name, String location, List<String> subjects) {
		super();
		this.classid = classid;
		this.name = name;
		this.location = location;
		this.subjects = subjects;
	}

	public Student() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(other.getName());
	}

	
	

	
	

	

}