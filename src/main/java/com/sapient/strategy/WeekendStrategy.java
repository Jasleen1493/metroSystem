package com.sapient.strategy;

public class WeekendStrategy implements FareStrategy {
	@Override
	public String getName() {
		return WeekendStrategy.class.toGenericString();
	}
	
	@Override
	public double getFarePerStation() {
		return 5.5;
	}
}
