package com.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellowSpringApp {

	
	public static void main(String[] args) {
		// load the spring config
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive  the bean from spring
		Coach theCoach=context.getBean("myCoach",Coach.class);
		//call methode on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDialyFortune());
		//close the context
		context.close();
	}

}
