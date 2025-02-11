package com.shiva.SC_Student_02;

import java.util.List;
import java.util.Set;

public class College {

	private String name;
	private List<Student>students;
	private Set<String>faculties;
	public void setName(String name) {
		this.name = name;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void setFaculties(Set<String> faculties) {
		this.faculties = faculties;
	}
	
	
	public void displayDetails()
	{
		System.out.println("College Name : "+name);
		System.out.println("Faculties Names");
		faculties.stream().forEach(System.out::println);
		System.out.println("Student Information");
		students.stream().forEach(s->System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd()));
	}
	
	
	
}
