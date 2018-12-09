package chapter07;

import chapter07.inventory.Buyer;
import chapter07.inventory.Computer;
import chapter07.inventory.ProductTv;

public class PolyArgumentTest {
	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new ProductTv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "원 입니다.");
		System.out.println("현재 적립된 보너스 포인트는 " + b.bonusPoint + "원 입니다.");
		

		b.buy(new ProductTv());
		b.buy(new ProductTv());
		b.buy(new ProductTv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new ProductTv());
		

		System.out.println("현재 남은 돈은 " + b.money + "원 입니다.");
		System.out.println("현재 적립된 보너스 포인트는 " + b.bonusPoint + "원 입니다.");
		
	}

}
