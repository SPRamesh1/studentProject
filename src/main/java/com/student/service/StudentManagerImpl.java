package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.dao.StudentDAO;
import com.student.entity.StudentEntity;

@Service
public class StudentManagerImpl implements StudentManager {
	
	@Autowired
    private StudentDAO studentDAO;

	@Override
	@Transactional
	public List<StudentEntity> getAllStudent() {
		return studentDAO.getAllStudentList();
	}

	public void setEmployeeDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
}
