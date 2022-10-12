package mru.tsc.application;

import mru.tsc.control.CardController;

/**
 * This is the application class and runs an instance of launchApplication.
 * @author Emilio G, Nik S.
 *
 */
public class application {

	/**
	 * Static void main
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println("**WELCOME TO WARGAME!!\n");
		CardController game = new CardController();
		game.launchApplication();
		
	}

}
