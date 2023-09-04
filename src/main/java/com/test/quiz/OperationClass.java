package com.test.quiz;

public class OperationClass {
	
	public int operation(int n1, int n2, String op) {
		int result = 0;
		
		switch(op) {
		case "+":
			result = n1+n2;
			break;
		case "-":
			result = n1-n2;
			break;
		case "*":
			result = n1*n2;
			break;
		case "/":
			result = n1/n2;
		default:
			System.out.println("잘못입력");
		}
		return result;
	}
	
	
	
}
