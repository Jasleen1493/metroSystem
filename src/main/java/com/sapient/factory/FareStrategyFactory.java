package com.sapient.factory;

import com.sapient.strategy.FareStrategy;
import com.sapient.strategy.WeekdayStrategy;
import com.sapient.strategy.WeekendStrategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class  FareStrategyFactory {
	static final FareStrategy  weekdayStrategy = new WeekdayStrategy();
	static final FareStrategy  weekendStrategy= new WeekendStrategy();
	
	public static FareStrategy getFareStrategy(LocalDateTime localDateTime){
		if(localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY || localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY)
			return weekendStrategy;
		else
			return weekdayStrategy;
	}
}
