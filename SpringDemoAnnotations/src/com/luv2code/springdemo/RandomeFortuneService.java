package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomeFortuneService implements FortuneService {

	private String[] data= {
			"All wise man fear 3 things",
			"Moonless night",
			"Storm in the middle of the sea"
	};
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
