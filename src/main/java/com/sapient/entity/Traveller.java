package com.sapient.entity;

public class Traveller {
	private long id;
	private String name;
	
	private SmartCard smartCard;
	
	public Traveller(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public SmartCard getSmartCard() {
		return smartCard;
	}
	
	public void setSmartCard(SmartCard smartCard) {
		this.smartCard = smartCard;
	}
}
