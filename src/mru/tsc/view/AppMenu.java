package mru.tsc.view;
import java.util.Scanner;
/**
 * 
 * @author sriva
 *
 */
public class AppMenu {
	
	Scanner myObj;
	Scanner dealObj;
	int mainMenuChoice;

	/**
	 * 
	 */
	public AppMenu() {
		
		myObj = new Scanner(System.in);
		dealObj = new Scanner(System.in);
	
	}

	/**
	 * 
	 * @return
	 */
	public int showMainMenu() {
		
		while (true) {
	    System.out.println("Select one of these options:");
	    System.out.println("1.   Play Game");
	    System.out.println("2.   Shuffle Cards");
	    System.out.println("3.   Exit");
	    System.out.print("Enter your choice: ");
	    
	    	if(myObj.hasNextInt()) {
	    		int mainMenuChoice = myObj.nextInt();
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
	 * 
	 * @return
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
