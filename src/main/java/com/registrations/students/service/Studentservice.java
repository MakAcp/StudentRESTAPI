package com.registrations.students.service;

import java.util.List;

import com.registrations.students.entities.Student;

public interface Studentservice {
	
	public List<Student> getstudents();

	public Student getstudent(long l);

	public Student addstudent(Student student);

	public Student delstudent(long l);

	public String updatestudent(long id, Student student);
}
