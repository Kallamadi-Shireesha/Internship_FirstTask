package com.infotech.student.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.infotech.student.entities.Student;

@Repository

public interface Studentdao extends PagingAndSortingRepository<Student,Integer>{

	
	ArrayList<Student> save(ArrayList<Student> student);

	

	
	
}