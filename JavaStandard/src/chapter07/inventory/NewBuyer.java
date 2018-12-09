package chapter07.inventory;

import java.util.Vector;

public class NewBuyer {
	public int money = 1000;
	public int bonusPoint = 0;
	public Vector<Product> item = new Vector<Product>();
	int i = 0;
	
	
	public void buy (Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
		
	}
	
	public void refund (Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 리스트에 해당 제품이 없습니다.");
		}
	}
	
	public void summary() {
		int sum =0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i =0; i<item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("총 금액 : " + sum);
		System.out.println("제품들 : " + itemList);
	}
}
