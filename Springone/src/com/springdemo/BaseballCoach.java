package com.springdemo;

public class BaseballCoach implements Coach {
	//private field
	private FortuneService fortuneService;
	//constructor
public BaseballCoach(FortuneService thefortuneservice) {
	fortuneService=thefortuneservice;
}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "get 30 mints workout dialy";
	}

	@Override
	public String getDialyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
