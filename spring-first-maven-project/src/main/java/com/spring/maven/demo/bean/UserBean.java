package com.spring.maven.demo.bean;

public class UserBean {
	private String name;
	private int age;
	public UserBean() {
		//non-parameterized construction from super class
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserBean [name=" + name + ", age=" + age + "]";
	}

}
