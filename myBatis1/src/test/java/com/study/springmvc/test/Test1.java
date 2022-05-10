package com.study.springmvc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.springmvc.dao.MemberAccountMapper;
import com.study.springmvc.entity.Student;

@SpringBootTest
public class Test1 {
    
	@Autowired
	private MemberAccountMapper mapper;
	
	@Test
	public void add() {
		Student student = new Student();
		student.setName("Mary");
		mapper.add(student);
	}
	
}
