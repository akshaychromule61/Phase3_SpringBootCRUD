package com.foobar.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.foobar.demo.userBeans.Bar;
import com.foobar.demo.userBeans.Foo;

public class FooBarApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring Application started....");
		Foo f = context.getBean("fooBean",Foo.class);
		System.out.println(f);
		
		Bar b = context.getBean("barBean",Bar.class);
		System.out.println(b);
		
		context.close();
	}

}
