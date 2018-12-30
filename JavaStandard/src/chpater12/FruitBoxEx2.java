package chpater12;

import java.util.ArrayList;

interface Eatable {
}

public class FruitBoxEx2 {
	public static void main(String[] args) {
		
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>();
		//FruitBox<Grape2> grapeBox = new FruitBox<Apple2>(); // Ÿ�� ����ġ
		//FruitBox<Toy2>   toyBox    = new FruitBox<Toy2>();   // ��ӹ���

		fruitBox.add(new Fruit2());
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		//appleBox.add(new Grape2());  // ����. Grape�� Apple�� �ڼ��� �ƴ�
		grapeBox.add(new Grape2());

		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapeBox-" + grapeBox);
	}
}

class FruitBox2<T extends Fruit2 & Eatable> extends Box<T> {
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}

class Fruit2 implements Eatable {
	public String toString() {
		return "Fruit";
	}
}

class Apple2 extends Fruit2 {
	public String toString() {
		return "Apple";
	}
}

class Grape2 extends Fruit2 {
	public String toString() {
		return "Grape";
	}
}

class Toy2 {
	public String toString() {
		return "Toy";
	}
}
