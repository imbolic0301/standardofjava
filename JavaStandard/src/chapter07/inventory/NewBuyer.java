package chapter07.inventory;

import java.util.Vector;

public class NewBuyer {
	public int money = 1000;
	public int bonusPoint = 0;
	public Vector<Product> item = new Vector<Product>();
	int i = 0;
	
	
	public void buy (Product p) {
		if(money < p.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
		
	}
	
	public void refund (Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"��/�� ��ǰ�ϼ̽��ϴ�.");
		} else {
			System.out.println("�����Ͻ� ��ǰ ����Ʈ�� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	public void summary() {
		int sum =0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i =0; i<item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("�� �ݾ� : " + sum);
		System.out.println("��ǰ�� : " + itemList);
	}
}
