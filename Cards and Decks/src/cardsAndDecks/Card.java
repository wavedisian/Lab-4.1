package cardsAndDecks;

public class Card {

	private String[] suitrank = {"Diamonds", "Clubs", "Hearts", "Spades"};
	private String name, suit;
	private int value;
	
	public Card(String name, String suit, int value)
	{
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getSuit()
	{
		return this.suit;
	}
	public int getValue()
	{
		return this.value;
	}
	
	public String toString()
	{
		return this.name + " of " + this.suit;
	}
	
	public void print()
	{
		System.out.print(this.toString());
	}
	
	public int suitRank()
	{
		for(int x = 0; x < 4; x++)
		{
			if(this.suitrank[x].compareTo(this.suit)==0)
			{
				return x;
			}
		}
		return -1;
	}
	
	public int compareTo(Card other)
	{
		if(this.value > other.getValue())
		{
			return 1;
		}
		if(this.value == other.getValue()) 
		{
			if(this.suitRank() > other.suitRank())
			{
				return 1;
			}
			if(this.suitRank() == other.suitRank())
			{
				return 0;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return -1;
		}
	}
	
	
}
