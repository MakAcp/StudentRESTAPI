package com.registrations.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registrations.students.entities.Student;
import com.registrations.students.service.Studentservice;

@RestController
public class MyController {
	
	@Autowired
	private Studentservice studentservice;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome home";
	}
	
	@GetMapping("/students")
	public List<Student> getstudents()
	{
		return this.studentservice.getstudents();
	}
	
	@GetMapping("/students/{studentid}")
	public Student getstudent(@PathVariable String studentid)
	{
		return this.studentservice.getstudent(Long.parseLong(studentid));
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		return this.studentservice.addstudent(student);
	}	
	
	@DeleteMapping("/students/{studentid}")
	public Student delStudent(@PathVariable String studentid)
	{
		return this.studentservice.delstudent(Long.parseLong(studentid));
	}
	
	@PutMapping("/students/{studentid}")
	public String updateStudent(@PathVariable String studentid,@RequestBody Student student)
	{
		return this.studentservice.updatestudent(Long.parseLong(studentid),student);
	}
	
}
