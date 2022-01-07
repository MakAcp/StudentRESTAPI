package com.registrations.students.entities;

public class Student {
	private String name;
	private long id;
	private int rollno;
	private String address;
	
	public Student(String name, long id, int rollno, String address) {
		super();
		this.name = name;
		this.id = id;
		this.rollno = rollno;
		this.address = address;
	}
	
	

	//public Student() {
	//	super();
	//}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", rollno=" + rollno + ", address=" + address + "]";
	}

	
	
}
