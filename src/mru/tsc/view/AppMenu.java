package mru.tsc.view;
import java.util.Scanner;
/**
 * 
 * This class is in charge of displaiyng all the menu's needed for the wargame program. This class has methods showMainMenu, and playwargamedealer. 
 * @author Emilio G, Nik S.
 *
 */
public class AppMenu {
	
	private Scanner myObj; //scanner defined for the main menu.
	private Scanner dealObj; //scanner defined for the game menu.
	private int mainMenuChoice; //the choice that the user chooses in the main menu.
	private int dealerChoice; //the choice 

	/**
	 * AppMenu constructor, here the scanners are intialized for the two menus, being the mainmenu and the game menu.
	 */
	
	public AppMenu() {
		
		myObj = new Scanner(System.in);
		dealObj = new Scanner(System.in);
	
	}

	/**
	 * Main menu for the game.
	 */
	public int showMainMenu() {
		
		while (true) {
	    System.out.println("Select one of these options:");
	    System.out.println("1.   Play Game");
	    System.out.println("2.   Shuffle Cards");
	    System.out.println("3.   Exit");
	    System.out.print("Enter your choice: ");
	    
	    	if(myObj.hasNextInt()) {
	    		mainMenuChoice = myObj.nextInt();
	    	    return mainMenuChoice;
	    	}
	    	
	    	else {
	    		System.out.println("");
	    		System.out.println("Text not allowed, try again.");
	    		System.out.println("");
	    		myObj.nextLine();
	    	}
	    	
	    }
	    
	}
	
	/**
	 * Game menu for the game, or how many cards are dealt to each player.
	 */
	public int playWarGameDealer() {
		
		System.out.println("");
		while (true) {
		System.out.print("How many cards to deal: ");
		
			if (dealObj.hasNextInt()) {
				int dealerChoice = dealObj.nextInt();
				dealObj.nextLine();
				return dealerChoice;
			}
		
			else {
				System.out.println("No text allowed! Try again.");
				dealObj.nextLine();
			}
		}
	}
	
}
