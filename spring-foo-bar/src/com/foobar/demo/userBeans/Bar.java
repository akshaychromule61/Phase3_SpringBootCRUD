package com.foobar.demo.userBeans;

public class Bar {
	private String name;
	private int age;
	public Bar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bar(String name, int age) {
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
		return "Bar [name=" + name + ", age=" + age + "]";
	}
	

}
