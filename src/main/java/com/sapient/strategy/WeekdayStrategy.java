package com.sapient.strategy;

public class WeekdayStrategy implements FareStrategy{
	
	@Override
	public String getName() {
		return WeekdayStrategy.class.toGenericString();
	}
	
	@Override
	public double getFarePerStation() {
		return 7;
	}
}
