package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.student.entity.EmployeeEntity;
import com.student.entity.StudentEntity;
import com.student.service.StudentManager;

@Controller
public class StudentController {
	
	@Autowired
	private StudentManager studentManager;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listStudent(ModelMap map) 
	{
		map.addAttribute("employee", new StudentEntity());
		map.addAttribute("employeeList", studentManager.getAllStudent());
		
		return "editEmployeeList";
	}
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}
}
