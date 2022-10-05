import mru.tsc.model.LinkedListStack;
import mru.tsc.view.*;

public class WarGame {
	
	public static void main(String[] args) {

		
		AppMenu AppMenuObject = new AppMenu();
		int cardsDealt = AppMenuObject.playWarGameDealer();
		LinkedListStack Player1 = new LinkedListStack(cardsDealt);
		LinkedListStack Player2 = new LinkedListStack(cardsDealt);
		
	
	

	}

}