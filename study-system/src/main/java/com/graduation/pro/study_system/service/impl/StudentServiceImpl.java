package com.graduation.pro.study_system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduation.pro.study_system.mapper.StudentDao;
import com.graduation.pro.study_system.pojo.Student;
import com.graduation.pro.study_system.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	public int insertStu(Student stu) {
		studentDao.insertStu(stu);
		return 1;
	}
	

}
