package billfold;

import cards.Card;

public class Billfold {
	// Spencer Davis

	private Card card1;
	private Card card2;
	private int expiredCount;

	public void addCard(Card c) {
		if (card1 == null) {
			card1 = c;
		} else if (card2 == null) {
			card2 = c;
		}
	}

	public int getExpiredCardCount() {
		if (this.card1.isExpired()) {
			expiredCount++;
		}
		if (this.card2.isExpired()) {
			expiredCount++;
		}

		return expiredCount;
	}

	public String formatCards() {
		return "[" + card1.format() + " | " + card2.format() + "]";
	}
}
