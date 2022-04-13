package com.javaeunjeong.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		StudentInfo student1 = ctx.getBean("student1",StudentInfo.class);
		StudentInfo student2 = ctx.getBean("student2",StudentInfo.class);
		
		student1.getInfoPrint();
		student2.getInfoPrint();
		
		ctx.close();
		
	}

}
