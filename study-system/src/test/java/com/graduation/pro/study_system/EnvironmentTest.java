package com.graduation.pro.study_system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.graduation.pro.study_system.pojo.Student;
import com.graduation.pro.study_system.service.StudentService;

public class EnvironmentTest {
	public static void main(String[] args) {
		  @SuppressWarnings("resource")
	       ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
	                ,"classpath:conf/spring-mybatis.xml"});
		  StudentService studentService=(StudentService) context.getBean("studentServiceImpl");
		  Student student= new Student();
		  student.setStuName("luyong");
		  System.out.println(studentService.insertStu(student));
	}

}
