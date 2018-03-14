package cardsAndDecks;

public class Deck {

	public Deck(String[] name, String[] suit, int[] value)
	{
		for(int x = 0; x < name.length; x++)
		{
			for(int y = 0; y < suit.length; y++)
			{
				unDealt.add(new Card());
			}
		}
	}
}
