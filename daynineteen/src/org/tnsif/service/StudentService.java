package org.tnsif.service;

import java.util.List;

import org.tnsif.entities.Student;

public interface StudentService {
		
	public boolean addStudent(Student student);//create operation
	public Student getStudent(int rollno);//retrieve with specific id
	public List<Student>getAll();//retrieve all the data
	public Student updateStudent(Student student);//update
	public boolean deleteStudent(int rollno);//delete


}
