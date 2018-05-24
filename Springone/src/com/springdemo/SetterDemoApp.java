package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//Load the spring config
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean from spring
		CricketCoach thecoach=context.getBean("myCricketCoach", CricketCoach.class);
		//call methodes on bean
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getFortune());
		System.out.println(thecoach.getEmailAddress());
		System.out.println(thecoach.getTeam());
		//close the context
		context.close();
	}

}
