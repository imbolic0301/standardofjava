package chapter09;

import chapter09.inventory.Card;

public class CardToString2 {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 2);

		System.out.println(c1.toString());
		System.out.println(c2.toString()); 

	}

}
