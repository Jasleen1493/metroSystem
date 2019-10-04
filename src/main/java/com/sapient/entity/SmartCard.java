package com.sapient.entity;

import java.time.LocalDateTime;

public class SmartCard {
	private long id;
	private String sourceStation;
	private String destinationStation;
	private double fare;
	private LocalDateTime localDateTime;
	private double balance;
	
	private Traveller traveller;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getSourceStation() {
		return sourceStation;
	}
	
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	
	public String getDestinationStation() {
		return destinationStation;
	}
	
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	
	public double getFare() {
		return fare;
	}
	
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Traveller getTraveller() {
		return traveller;
	}
	
	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
}
