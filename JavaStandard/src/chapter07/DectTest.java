package chapter07;

import chapter07.inventory.Card;
import chapter07.inventory.Deck;

public class DectTest {

	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
		
	}

}
