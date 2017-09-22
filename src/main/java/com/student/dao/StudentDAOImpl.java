package com.student.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;

@Repository
public class StudentDAOImpl implements StudentDAO  {

	@Autowired
    private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentEntity> getAllStudentList() {
		return this.sessionFactory.getCurrentSession().createQuery("from StudentEntity").list();
	}

}
