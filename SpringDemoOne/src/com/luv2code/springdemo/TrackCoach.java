/**
 * 
 */
package com.luv2code.springdemo;

/**
 * @author nikola.ilic
 *
 */
public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: " + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("inside my startup stuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("inside my cleanup stuff");
	}

}
