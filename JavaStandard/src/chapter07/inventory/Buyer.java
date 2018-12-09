package chapter07.inventory;

public class Buyer {
	public int money = 1000;
	public int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	
	public void buy (Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
		
	}
	
	public void summary() {
		int sum =0;
		String itemList = "";
		for (Product p : item) {
			if( p == null) break;
			sum += p.price;
			itemList += p + ", ";
		}
		System.out.println("총 금액 : " + sum);
		System.out.println("제품들 : " + itemList);
	}
}
