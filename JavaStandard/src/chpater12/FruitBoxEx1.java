package chpater12;

import java.util.ArrayList;

public class FruitBoxEx1 {
	public static void main(String[] args) {

		Box1<Fruit> fruitBox1 = new Box1<Fruit>();
		Box1<Apple> appleBox1 = new Box1<Apple>();
		Box1<Toy> toyBox1 = new Box1<Toy>();
		// Box1<Grape> grapeBox1 = new Box1<Apple>(); // 타입 불일치

		fruitBox1.add(new Fruit());
		fruitBox1.add(new Apple()); // OK. void add(Fruit item)

		appleBox1.add(new Apple());
		appleBox1.add(new Apple());
		// appleBox1.add(new Toy()); // 에러. Box1<Apple>에는 Apple만 담을 수 있음

		toyBox1.add(new Toy());
		// toyBox1.add(new Apple()); // 에러. Box1<Toy>에는 Apple을 담을 수 없음

		System.out.println(fruitBox1);
		System.out.println(appleBox1);
		System.out.println(toyBox1);
	}

}

class Box1<T> {
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

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}
