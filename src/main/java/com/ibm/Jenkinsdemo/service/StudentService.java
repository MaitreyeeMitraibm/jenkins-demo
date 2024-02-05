package com.ibm.Jenkinsdemo.service;

import java.util.List;

import com.ibm.Jenkinsdemo.model.Student;

public interface StudentService {
	
	Student createStudent(Student student);
	
	List<Student> getAllStudents();

}
