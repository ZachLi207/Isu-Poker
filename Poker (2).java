import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Poker implements ActionListener {
public static int[] drawnCards = {};

	public static int numGenerator () {
		//This method returns a random integer from 1 to 52, inclusive, to represent
		//each card. It makes sure that there are no repeats by calling the contains method.
		int card;
		do {
			card = (int) (Math.random() * 52) + 1;
		} while (contains(drawnCards, card));
		int[] newDrawnCards = new int[drawnCards.length + 1];
		for (int i = 0; i < drawnCards.length; i++) {
			newDrawnCards[i] = drawnCards[i];
		}
		newDrawnCards[drawnCards.length] = card;
		drawnCards = newDrawnCards;
		return card; 
	}
	
	public static boolean contains(int[] array, int value) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return true;
			}
		}
		return false;
	}
	
	public static void main (String [] args){
	
		for (int i = 0; i < 52; i ++) {
			int result = numGenerator ();
			System.out.println(result);
		}
		new Poker ();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}

