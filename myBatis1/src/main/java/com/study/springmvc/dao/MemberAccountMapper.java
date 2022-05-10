package com.study.springmvc.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.study.springmvc.entity.Student;

@Mapper
public interface MemberAccountMapper {

	@Insert("INSERT INTO tb_students(stu_name) VALUES(#{name})")
	public int add(Student student); 	
 }
