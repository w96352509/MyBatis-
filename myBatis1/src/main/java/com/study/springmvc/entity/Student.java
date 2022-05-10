package com.study.springmvc.entity;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		
		this.name = name;
	}
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}
