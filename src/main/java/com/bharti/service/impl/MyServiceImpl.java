package com.bharti.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.bharti.dao.MyDao;
import com.bharti.model.Student;
import com.bharti.service.MyService;

@Named
public class MyServiceImpl implements MyService {

	@Inject
	private MyDao myDao;
	
	@Transactional
	public void saveOrUpdate(Student student) {
		myDao.saveOrUpdate(student);
	}

	public List<Student> getAllStudentByCollegeName() {
		return myDao.getAllStudentByCollegeName();
	}

	public List<Student> lazzyLoadingForStudent(Integer startPosition, Integer noOfRecords) {
		return myDao.lazzyLoadingForStudent(startPosition, noOfRecords);
	}

}
