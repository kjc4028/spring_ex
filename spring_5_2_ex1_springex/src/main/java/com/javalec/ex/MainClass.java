package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		
		Pencil pencil4 = ctx.getBean("pencil4", Pencil.class);
		pencil4.use();
		
		Pencil pencil6 = ctx.getBean("pencil6", Pencil.class);
		pencil6.use();
		
		
		ctx.close();
		
	}

}
