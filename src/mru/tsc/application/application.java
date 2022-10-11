package mru.tsc.application;

import mru.tsc.control.CardController;


public class application {

	public static void main(String[] args) throws Exception {
		
		System.out.println("**WELCOME TO WARGAME!!\n");
		CardController game = new CardController();
		game.launchApplication();
		
	}

}
