package com.bharti.dao.impl;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bharti.dao.MyDao;
import com.bharti.model.Student;

@Named
public class MydaoImpl implements MyDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void saveOrUpdate(Student student) {
		entityManager.persist(student);
	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudentByCollegeName() {
		StringBuilder sbQuery = new StringBuilder()
				.append("db.student.aggregate([{'$match' : {'collageName' : 'VNSGU'}}])");
		List<Student> listOfStudent = entityManager.createNativeQuery(sbQuery.toString(), Student.class)
				.getResultList();
		return listOfStudent;
	}

	@SuppressWarnings("unchecked")
	public List<Student> lazzyLoadingForStudent(Integer startPosition, Integer noOfRecords) {
		StringBuilder sbQuery = new StringBuilder()
				.append("db.student.aggregate([{'$match' : {'collageName' :'VNSGU'}}])");

		List<Student> listOfStudentWithOutPagination = entityManager
				.createNativeQuery(sbQuery.toString(), Student.class).getResultList();

		System.out.println("Total Student without pagination..." + listOfStudentWithOutPagination.size());

		List<Student> listOfStudent = entityManager.createNativeQuery(sbQuery.toString(), Student.class)
				.setFirstResult(startPosition).setMaxResults(noOfRecords).getResultList();
		return listOfStudent;
	}

}