package com.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard Ram";
	}

	@Override
	public String getDialyFortune() {
		// TODO Auto-generated method stub
		return "JUST DO IT " + fortuneService.getFortune();
	}

}
