package com.css.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	//create a non-arg constructor
	public CricketCoach() {
		System.out.println("Cricket coach: inside the non-arg constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach: inside setter method - setTeam");
		this.team = team;
	}

	//Setter method 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling daily";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
