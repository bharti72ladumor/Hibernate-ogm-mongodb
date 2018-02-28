package com.bharti.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bharti.model.Student;
import com.bharti.service.MyService;
import com.bharti.utils.MyUtils;

@Controller
public class MyController {

	@Inject
	private MyService myService;

	@RequestMapping("/hello")
	@ResponseBody
	@CrossOrigin
	public String hello() {
		return "hello";
	}

	@RequestMapping("/save")
	@ResponseBody
	@CrossOrigin
	public String save() {
		Student bharti = new Student();
		bharti.setName("Bharti");
		bharti.setCollageName("WADIYA");
		myService.saveOrUpdate(bharti);

		Student komal = new Student();
		komal.setName("Priya");
		komal.setCollageName("WADIYA");
		myService.saveOrUpdate(komal);

		Student ashwin = new Student();
		ashwin.setName("Meera");
		ashwin.setCollageName("VNSGU");
		myService.saveOrUpdate(ashwin);

		Student mahesh = new Student();
		mahesh.setName("Sanaya");
		mahesh.setCollageName("VNSGU");
		myService.saveOrUpdate(mahesh);

		return "success";
	}

	@RequestMapping("/getAllStudents")
	@ResponseBody
	@CrossOrigin
	public List<Student> getAllStudentByCollegeName() {
		return myService.getAllStudentByCollegeName();
	}

	@RequestMapping("/lazzyLoadingForStudent")
	@ResponseBody
	@CrossOrigin
	public List<Student> lazzyLoadingForStudent(@RequestParam Integer startPosition,
			@RequestParam Integer noOfRecords) {
		
		if (MyUtils.isObjectIsNullOrEmpty(startPosition, noOfRecords)) {
			return new ArrayList<Student>();
		}
		return myService.lazzyLoadingForStudent(startPosition, noOfRecords);
	}
}
