package com.shiva.SC_Student_02;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class College {

	private String name;
	
	@Autowired
	private Student student;

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void displayDetails()
	{
		System.out.println("College Name : "+name);
		System.out.println("Student Information");
	System.out.println(student.getSno()+"\t"+student.getSname()+"\t"+student.getSadd());	
	}
	
	
	
}
