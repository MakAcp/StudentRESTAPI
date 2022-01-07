package com.registrations.students.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.registrations.students.entities.Student;

@Service
public class StudentServiceImplementation implements Studentservice{

	List<Student> ls;
	public StudentServiceImplementation() {
	ls=new ArrayList<>();
	
	ls.add(new Student("Nihar",112412,1,"Tens on West"));
	ls.add(new Student("Shyam",112,2,"Tens on West"));
	ls.add(new Student("Subodh",112419,3,"Tens on West"));
	ls.add(new Student("gerrard",1,4,"Tens on West"));
	
	}
	
	@Override
	public List<Student> getstudents() {
		// TODO Auto-generated method stub
		return ls;
	}

	@Override
	public Student getstudent(long id) {
		for(Student student:ls)
		{
			if(student.getId()==id)
			{
				return student;
			
			}
		}
		
		return null;
	}

	@Override
	public Student addstudent(Student student) {
		ls.add(student);
		return student;
	}

	@Override
	public Student delstudent(long l) {
		for(Student student:ls)
		{
			if(l==student.getId())
			{
			ls.remove(student);
			return student;
			}
		}
		return null;

	}

	@Override
	public String updatestudent(long id, Student student) {
		for(Student student1:ls)
		{
			if(id==student1.getId())
			{
			student1.setAddress(student.getAddress());
			student1.setName(student.getName());
			student1.setRollno(student.getRollno());
			return "Updated student";
			}
		}
		return "No suitable entry found";
	}

}
