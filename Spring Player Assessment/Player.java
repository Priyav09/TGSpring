package com.spring.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {

	private String playerId ; 
	private String playeName;
	
	@Autowired
	private Country country; 
	
	public Player(){}
	
	public Player(String playerId, String playeName, Country country) {
		super();
		this.playerId = playerId;
		this.playeName = playeName;
		this.country = country;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayeName() {
		return playeName;
	}
	public void setPlayeName(String playeName) {
		this.playeName = playeName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	} 
	
}
