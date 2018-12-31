package com.spring.player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSInput;

public class PlayerMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCxt = new AnnotationConfigApplicationContext(PlayerConfig.class);
		Country country = appCxt.getBean(Country.class);
		PlayerDetails pd = (PlayerDetails) appCxt.getBean(PlayerDetails.class);
		Player[] players = new Player[5];

		for (int i = 0; i < 5; i++) {
			players[i] = (Player) appCxt.getBean(Player.class);
		}

		Scanner s = new Scanner(System.in);

		List<Player> listPlayer = new ArrayList<Player>();
		listPlayer = pd.setPlayerDetails(players, country);
		pd.displayAllPlayers(listPlayer);

		System.out.println("Enter the country name  India or UK : ");
		String input = s.next();
		System.out.println("Players from " + input + " : ");
		pd.displayPlayerNames(listPlayer, input);
		System.out.println("Do you want other country player details Y or N ");
		input = s.next();
		if (input.equalsIgnoreCase("Y")) {
			System.out.println("Enter the country name  India or UK : ");
			input = s.next();
			System.out.println("Players from " + input + " : ");
			pd.displayPlayerNames(listPlayer, input);
		}
		System.out.println("End of session");
	}
}
