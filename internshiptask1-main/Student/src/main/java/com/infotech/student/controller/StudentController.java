package com.infotech.student.controller;

import com.infotech.student.entities.Student;
import com.infotech.student.service.StudentService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.Arrays;
@RestController
@RequestMapping(value="/students")
public class StudentController  {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(value="/create")
	public Student createStudent(@RequestBody Student student){
		return studentService.createStudent(student);
	}
	
	
	@GetMapping(value="/allstudents")
	public ArrayList<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	/*pagination and sort by name*/

	@GetMapping(value="final")
    public ResponseEntity<List<Student>> getAllEmployees(
                        @RequestParam(defaultValue = "0") Integer pageNo, 
                        @RequestParam(defaultValue = "10") Integer pageSize,
                        @RequestParam(defaultValue = "id") String sortBy) 
    {
        List<Student> list = studentService.getAllEmployees(pageNo, pageSize, sortBy);
 
        return new ResponseEntity<List<Student>>(list, new HttpHeaders(), HttpStatus.OK); 
    }
	
	/*
	@GetMapping(value="/pagenumber/{pageNo}/{pageSize}")
	
	public List<Student> getPaginated(@PathVariable int pageNo, @PathVariable int pageSize){
		
		return studentService.findPaginated(pageNo, pageSize);
		
	}
@GetMapping(value="/pagenumber")
	
	public List<Student> getPaginated(@RequestParam(defaultValue = "1") Integer pageNo, 
            @RequestParam(defaultValue = "3") Integer pageSize){
		
		return studentService.findPaginated(pageNo, pageSize);
		
	}
	*/
	/*students with starting letter"a"*/
	@GetMapping(value="/filterbyname")
	public List<Student> getStudentsstartswitha(){
		return studentService.getStudentsstartswitha();
	}
	@GetMapping(value="/sortbyname")
	public ArrayList<Student> sortbyname(){
		return studentService.sortbyname();
	}
	
	@GetMapping(value="/sortbylocation")
	public ArrayList<Student> sortbylocation(){
		return studentService.sortbylocation();
	}
	
	@GetMapping(value="/sortbyclass")
	public ArrayList<Student> sortbyclass(){
		return studentService.sortbyclass();
	}
	
	@GetMapping(value="/sortbynameandfilterbyletter_a")
	public ArrayList<Student> sortbynameandfilterbyletter_a(){
		return studentService.sortbynameandfilterbyletter_a();
	}
	
	
	
	
	
}