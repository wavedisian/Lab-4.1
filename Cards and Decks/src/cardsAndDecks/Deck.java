package cardsAndDecks;

import java.util.ArrayList;
import java.util.Random;


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
	
	public void shuffle()
	{
		int length = this.size()-1;
		int r;
		for(int k = this.size()-1; k > 0; k--)
		{
			r = (int) (length*(Math.random()));
			this.swap(k, r);
		}
	}
	
	public void bridge()
	{
		ArrayList<Card> bridged = new ArrayList<Card>();
		int L = 0;
		int M = this.size()/2-1;
		while(L + M < this.size())
		{
			bridged.add(unDealt.get(L));
			L++;
			bridged.add(unDealt.get(M));
			M++;
		}
		unDealt = bridged;
	}
	
	public void swap(int x, int y)
	{
		Card temp = unDealt.get(x);
		unDealt.set(x, unDealt.get(y));
		unDealt.set(y, temp);
	}
	
	
	
}
