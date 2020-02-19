package com.winterarm.spring.test;

import com.winterar.spring.demo.IDemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImportTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		IDemoService demoService = context.getBean("demoService", IDemoService.class);
		demoService.test();
	}
}
