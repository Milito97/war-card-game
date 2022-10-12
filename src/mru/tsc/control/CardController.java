package mru.tsc.control;

import mru.tsc.model.Shuffler;
import mru.tsc.view.AppMenu;

/**
 * This class is the card controller, this class deals exclusively with launching the application and any means of control through MVC.
 * @author Emilio G, Nik S.
 *
 */
public class CardController {
	
	
	private AppMenu menuObject; //menuObject to call menu instances.
	private WarGame warGameObject; //wargameObject to call an instance of wargame.
	private Shuffler shufflerObject; //shufflerObject to shuffle a deck of cards.
	
	/**
	 * This method is what launches the application, launches the instances of menus's, and then validates them accordingly.
	 * @throws Exception
	 */
	
	public void launchApplication() throws Exception {
		
			
		boolean flag = true;
		
		while(flag){
			
			menuObject = new AppMenu();
			int menuChoice = menuObject.showMainMenu();
			
			switch(menuChoice) {
				
			case 1:
				while(true) {
					int gameMenuChoice = menuObject.playWarGameDealer();
					if (gameMenuChoice > 0 && gameMenuChoice <= 26) {
						warGameObject = new WarGame(gameMenuChoice);
						break;
					}
					
					else {
						System.out.print("Invalid number of hands! Number must be less then 26 and above 0.)");
						continue;
					}
					
				}
				break;
			case 2:
				System.out.println("Method not implemented yet test");
//				shufflerObject = new Shuffler(null);
				break;
				
			case 3:
				System.out.println("Thank you for playing War!");
				flag = false;
				break;
			
			default:
				System.out.println("");
				System.out.println("Invalid Number! Enter options 1-3...");
				System.out.println("");
				break;
			}
		}
	}
	


}
