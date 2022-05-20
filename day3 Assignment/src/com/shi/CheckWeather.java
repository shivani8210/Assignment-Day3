package com.shi;

public class CheckWeather {
	
	boolean isSnowing = false;
	
	boolean isRaining = true;
	
	double temperature = 60.0;

	public static void main(String[] args) {
		
		CheckWeather d1 = new CheckWeather();
		
		if (d1.isRaining || d1.isSnowing || d1.temperature <= 50) {
			
			System.out.println("Let,s stay home.");
		}
		
		else {
			
			System.out.println("Let's go out!");
			
		}

	}

}
