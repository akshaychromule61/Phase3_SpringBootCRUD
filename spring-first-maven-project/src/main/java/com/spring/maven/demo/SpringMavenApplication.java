package com.spring.maven.demo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.maven.demo.bean.UserBean;

public class SpringMavenApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context-config.xml");
		System.out.println("First Spring application");
		UserBean user = context.getBean("userBean",UserBean.class);
		System.out.println(user);
		context.close();
	}

}
