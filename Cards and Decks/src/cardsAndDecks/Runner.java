package cardsAndDecks;

public class Runner {
	
	public static void main(String[] Args)
	{
		String[] names = {"2", "3", "4", "5", "6", "7", "8",
				          "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
		int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		Deck cards = new Deck(names, suits, values);
		
		cards.printUndealt();
		System.out.println();
		cards.shuffle();
		
		cards.printUndealt();
		System.out.println();
		cards.restore(); 
		
		cards.printUndealt();
		System.out.println();
		cards.bridge();
		
		cards.printUndealt();
		System.out.println();
		cards.restore(); 
		
		cards.printUndealt();
		System.out.println();
		
		cards.bridge();
		cards.shuffle();
		cards.bridge();
		cards.shuffle();
		
		cards.printUndealt();
		System.out.println();
		cards.restore();
		
	}
}
