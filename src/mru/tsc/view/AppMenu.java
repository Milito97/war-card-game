package mru.tsc.view;
import java.util.Scanner;

public class AppMenu {
	
	Scanner myObj;
	Scanner dealObj;

	public AppMenu() {
		
		myObj = new Scanner(System.in);
		dealObj = new Scanner(System.in);
				
	
	}

	public String showMainMenu() {
		
		System.out.println("Select one of these options:");
		System.out.println("1.   Play Game");
		System.out.println("2.   Shuffle Cards");
		System.out.println("3.   Exit");
		System.out.println("Enter your choice: ");
		String mainMenuChoice = myObj.nextLine();
		return mainMenuChoice;		
		
	}
	
	public int playWarGameDealer() {
		
		System.out.println("**WELCOME TO WARGAME!!");
		System.out.println("");
		System.out.println("How many cards to deal: ");
		int dealerChoice = dealObj.nextInt();
		return dealerChoice;
	}
	
}
