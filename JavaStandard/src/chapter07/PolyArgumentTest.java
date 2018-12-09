package chapter07;

import chapter07.inventory.Buyer;
import chapter07.inventory.Computer;
import chapter07.inventory.ProductTv;

public class PolyArgumentTest {
	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new ProductTv());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� " + b.money + "�� �Դϴ�.");
		System.out.println("���� ������ ���ʽ� ����Ʈ�� " + b.bonusPoint + "�� �Դϴ�.");
		

		b.buy(new ProductTv());
		b.buy(new ProductTv());
		b.buy(new ProductTv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new ProductTv());
		

		System.out.println("���� ���� ���� " + b.money + "�� �Դϴ�.");
		System.out.println("���� ������ ���ʽ� ����Ʈ�� " + b.bonusPoint + "�� �Դϴ�.");
		
	}

}
