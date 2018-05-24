package com.springdemo;

public class CricketCoach implements FortuneService {
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	public CricketCoach() {
	System.out.println("inside no-arg constructor");	
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside methode");
		this.fortuneService = fortuneService;
	}

	
public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("set email");	
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		
		return team;
	}

	public void setTeam(String team) {
		System.out.println("set team");	
		this.team = team;
	}

public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "fast bowling practise in 15 mints dialy";
	}


	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
