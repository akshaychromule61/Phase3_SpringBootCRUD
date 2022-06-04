package com.spring.apps.calculator.beans.arithmeticoperations;

public class BasicArithmeticOperations {
	private int num1;
	private int num2;
	public BasicArithmeticOperations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BasicArithmeticOperations(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "BasicArithmeticOperations [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	public void add() {
		System.out.println("Addition of "+ num1 +" and " +num2+" is: "+ (num1+num2));
	}
	public void subtract() {
		System.out.println("Substraction of "+num1+" and "+num2+" is:"+ (num1-num2));
	}
	public void multiply() {
		System.out.println("Multiplication of "+num1+" and "+num2+" is:"+ (num1*num2));
	}
	public void devide() {
		if(num2!=0) {
			System.out.println("Divison of "+num1+" and "+num2+" is:"+(num1/num2));
		}else {
			System.out.println("Number is not divisible by 0");
		}
	}
	
	
	
}
