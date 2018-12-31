package com.spring.player;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.*;

@Configuration
public class PlayerConfig {
	
	@Bean
	@Scope("prototype")
	public Player getPlayer() {
		return new Player();
	} 
	
	@Bean
	@Scope("prototype")
	public Country getCountry() {
		return new Country();
	} 
	
	@Bean
	@Scope("prototype")
	public PlayerDetails getPlayerDetails() {
		return new PlayerDetails();
	}

}
