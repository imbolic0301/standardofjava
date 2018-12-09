package chapter07;

import chapter07.inventory.Audio;
import chapter07.inventory.Buyer;
import chapter07.inventory.Computer;
import chapter07.inventory.ProductTv;

public class PolyArgumentTest2 {
	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new ProductTv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();
		
	}

}
