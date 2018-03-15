package cardsAndDecks;

import java.util.ArrayList;
import java.util.Random;
import java.

public class Deck {

	private ArrayList<Card> unDealt = new ArrayList<Card>();
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	
	public Deck(String[] name, String[] suit, int[] value)
	{
		for(int x = 0; x < name.length; x++)
		{
			for(int y = 0; y < suit.length; y++)
			{
				unDealt.add(new Card(name[x], suit[y], value[x]));
			}
		}
	}
	
	public boolean isEmpty()
	{
		if(unDealt.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int size()
	{
		return unDealt.size();
	}
	
	public Card deal()
	{
		Card x = unDealt.remove(0);
		Dealt.add(x);
		return x;
	}
	
	public shuffle()
	{
		int r;
		for(int k = this.size()-1; k > 0; k--)
		{
			r = (int) (k*(Math.random()));
			Collections.swap(unDealt, k, r);
		}
	}
	
	
}
