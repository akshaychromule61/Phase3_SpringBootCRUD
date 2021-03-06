package com.firstSpring.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.firstSpring.demo.beans.UserBean;

public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this will launch the application
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context-config.xml"); //triggers contextrefresh event
		System.out.println("First Spring application");
		UserBean user = context.getBean("userBean",UserBean.class);
		System.out.println(user);
		context.close();
	}

}
