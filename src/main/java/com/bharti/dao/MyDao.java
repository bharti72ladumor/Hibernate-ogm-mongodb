package com.bharti.dao;

import java.util.List;

import com.bharti.model.Student;


public interface MyDao {

	/***
	 * This function is used to saveOrUpdate student.
	 * @param student indicates student object for save/update.
	 */
	public void saveOrUpdate(Student student);
	
	/***
	 * This function is used to get all student where college name is 'VNSGU'.
	 * @return list of students.
	 */
	public List<Student> getAllStudentByCollegeName();
	
	/***
	 * This function is used to get noOfRecords from startPostion
	 * @param startPosition indicates start position
	 * @param noOfRecords indicates total no of records.
	 * @return
	 */
	public List<Student> lazzyLoadingForStudent(Integer startPosition, Integer noOfRecords);
}
