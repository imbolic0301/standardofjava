package chapter07;

import chapter07.inventory.Audio;
import chapter07.inventory.NewBuyer;
import chapter07.inventory.Computer;
import chapter07.inventory.ProductTv;

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		
		NewBuyer b = new NewBuyer();
		
		b.buy(new ProductTv());
		b.buy(new Computer());
		Audio audio = new Audio();
		b.buy(audio);
		
		b.summary();	
		System.out.println();
		
		b.refund(audio);
		b.summary();
		
	}

}
