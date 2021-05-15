package com.css.springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	//define constructor for dependency injection 
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "In the morning"+" run fast on track";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it "+fortuneService.getFortune();
	}
	
	// add an init method
	public void myStartup() {
		System.out.println("TrackCoach: inside methode myStartup");
	}
	
	// add a destroy method 
	public void myCleanup() {
		System.out.println("TrackCoach: inside method myCleanup");
	}

}







