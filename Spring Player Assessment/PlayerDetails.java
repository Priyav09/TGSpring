package com.spring.player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class PlayerDetails {
	ApplicationContext appCxt = new AnnotationConfigApplicationContext(PlayerConfig.class);
	Country country = appCxt.getBean(Country.class);
//	PlayerDetails pd = (PlayerDetails) appCxt.getBean(PlayerDetails.class);




	public List<Player> setPlayerDetails(Player[] player, Country country) {
		List<Player> listOfPlayer = new ArrayList<Player>();
		
		/*
		player[0].setPlayerId("P001");
		player[0].setPlayeName("MS Dhoni");
		player[0].setCountry(setCountryDetails("India"));
		listOfPlayer.add(player[0]);

		player[1].setPlayerId("P002");
		player[1].setPlayeName("Sachin");
		player[1].setCountry(setCountryDetails("India"));
		listOfPlayer.add(player[1]);

		player[2].setPlayerId("P003");
		player[2].setPlayeName("Michael");
		player[2].setCountry(setCountryDetails("UK"));
		listOfPlayer.add(player[2]); 
		
		player[3].setPlayerId("P004");
		player[3].setPlayeName("Kohli");
		player[3].setCountry(setCountryDetails("India"));
		listOfPlayer.add(player[3]); 
		
		player[4].setPlayerId("P005");
		player[4].setPlayeName("Smith");
		player[4].setCountry(setCountryDetails("UK"));
		listOfPlayer.add(player[4]);
*/
		PlayerDetails pd=new PlayerDetails();
		pd.addPlayer("P001", "ABC", new Country(), listOfPlayer);
		pd.addPlayer("P002", "ABC2", new Country(), listOfPlayer);
		pd.addPlayer("P003", "ABC3", new Country(), listOfPlayer);
		return listOfPlayer;

	}
	public void addPlayer(String id, String name, Country c, List<Player> list ) {
		Player players = new Player();
		players.setPlayerId(id);
		players.setPlayeName(name);
		players.setCountry(setCountryDetails("India"));
		list.add(players);

	}
	

	public Country setCountryDetails(String countryName) {
		Country country = appCxt.getBean(Country.class);
		if (countryName.equals("India")) {
			country.setCountryId("C001");
			country.setCountryName("India");
			return country;
		}

		if (countryName.equals("UK")) {
			country.setCountryId("C002");
			country.setCountryName("UK");
			return country;
		}

		return null;
	} 
	
	public void displayAllPlayers(List<Player> listOfPlayer) {
		
		System.out.println("All Player Details : ");
		System.out.println("--------------------------------------------------------");
		Iterator<Player> it1 = listOfPlayer.iterator();

		while (it1.hasNext()) {
			Player play = (Player) (it1.next());
			System.out.println("Player Id  : " + play.getPlayerId());
			System.out.println("Player Name : " + play.getPlayeName());
			System.out.println("Player Country : ");
			System.out.println("Country Code :" + play.getCountry().getCountryId());
			System.out.println("Country Name :" + play.getCountry().getCountryName());
			System.out.println("--------------------------------------------------------");
		}
		
		System.out.println("----------------------End of Player List------------------");
	}

	public void displayPlayerNames(List<Player> players , String countryName) {
		
		for(Player player : players) {
			if((player.getCountry().getCountryName()).equalsIgnoreCase(countryName) && countryName.equalsIgnoreCase("India")) {	
				System.out.println(player.getPlayeName());
				
				
			}
			
			if((player.getCountry().getCountryName()).equalsIgnoreCase(countryName) && countryName.equalsIgnoreCase("UK")) {
				System.out.println(player.getPlayeName());
				
			}
		}
	}
}
