package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomeFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		super();
		System.out.println("Calling TessnisCoach default constructor");
	}
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Calling TessnisCoach setter");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice you backahdn volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
