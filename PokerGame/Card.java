public class Card
{
	private short rank, suit;

	private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
	private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	public static String rankAsString( int __rank ) {
		return ranks[__rank];
	}

	Card(int suit, int rank)
	{
		this.rank=rank;
		this.suit=suit;
	}

	public @Override String toString()
	{
		  return ranks[rank-1] + " of " + suits[suit-1];
	}

	public short getRank() {
		 return rank;
	}

	public short getSuit() {
		return suit;
	}
}
