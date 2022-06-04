package com.spring.apps.calculator;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.apps.calculator.beans.arithmeticoperations.BasicArithmeticOperations;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this will launch the application
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("application-context-config.xml");
		BasicArithmeticOperations bao = context.getBean("baoBean",BasicArithmeticOperations.class);
		
		System.out.println("Select following option to perform the Arithmetic Operation:");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		Scanner sc =  new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
		case 1: bao.add();
				break;
		case 2: bao.subtract();
				break;
		case 3: bao.multiply();
				break;
		case 4: bao.devide();
				break;
		default:
				System.out.println("Sorry...Invalid Input");
		}
		context.close();
	}

}
