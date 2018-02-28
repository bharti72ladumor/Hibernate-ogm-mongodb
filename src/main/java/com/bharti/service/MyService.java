package com.bharti.service;

import java.util.List;

import com.bharti.model.Student;

public interface MyService {

	public void saveOrUpdate(Student student);
	
	public List<Student> getAllStudentByCollegeName();
	
	public List<Student> lazzyLoadingForStudent(Integer startPosition, Integer noOfRecords);
}
