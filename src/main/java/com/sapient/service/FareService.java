package com.sapient.service;

import com.sapient.entity.Station;
import com.sapient.factory.FareStrategyFactory;
import com.sapient.strategy.FareStrategy;

import java.time.LocalDateTime;

public class FareService {
	public double calculateFare(Station source, Station destination, LocalDateTime localDateTime){
		FareStrategy fareStrategy = FareStrategyFactory.getFareStrategy(localDateTime);
		int distance = source.distance(destination);
		double fare = distance * fareStrategy.getFarePerStation();
		return fare;
	}
}
