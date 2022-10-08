package mru.tsc.control;

import mru.tsc.model.Shuffler;
import mru.tsc.view.AppMenu;


public class CardController {
	
	
	AppMenu menuObject;
	WarGame warGameObject;
	Shuffler shufflerObject;
	
	
	public void launchApplication() throws Exception {
		
		boolean flag = true;
		
		while(flag){
			
			menuObject = new AppMenu();
			int menuChoice = menuObject.showMainMenu();
			
			switch(menuChoice) {
				
			case 1:
				int gameMenuChoice = menuObject.playWarGameDealer();
				warGameObject = new WarGame(gameMenuChoice);
				break;
				
			case 2:
				System.out.println("Method not implemented yet");
//				shufflerObject = new Shuffler(null);
				break;
				
			case 3:
				System.out.println("Thank you for playing War!");
				flag = false;
				break;
				
			}
		}
	}
	


}
