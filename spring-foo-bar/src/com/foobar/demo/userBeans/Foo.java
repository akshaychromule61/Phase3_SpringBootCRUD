package com.foobar.demo.userBeans;

public class Foo {
	private String name;

	public Foo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Foo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Foo [name=" + name + "]";
	}
	
	

}
