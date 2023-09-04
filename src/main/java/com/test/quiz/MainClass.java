package com.test.quiz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		String path = "classpath:applicationQUIZ.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		SaveClass sc = ctx.getBean("sc",SaveClass.class);
		
		sc.getPc().printFunc
		(sc.getNum1(),sc.getOp(), sc.getNum2(),sc.getOc().operation(sc.getNum1(), sc.getNum2(), sc.getOp()));
		
		
		
	}
}
