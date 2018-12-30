package chpater12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class FruitBoxEx4 {
	public static void main(String[] args) {
		FruitBox4<Apple4> appleBox4 = new FruitBox4<Apple4>();
		FruitBox4<Grape4> grapeBox4 = new FruitBox4<Grape4>();

		appleBox4.add(new Apple4("greenApple4", 300));
		appleBox4.add(new Apple4("greenApple4", 100));
		appleBox4.add(new Apple4("greenApple4", 200));

		grapeBox4.add(new Grape4("greenGrape4", 400));
		grapeBox4.add(new Grape4("greenGrape4", 300));
		grapeBox4.add(new Grape4("greenGrape4", 200));

		Collections.sort(appleBox4.getList(), new AppleComp());
		Collections.sort(grapeBox4.getList(), new GrapeComp());
		System.out.println(appleBox4);
		System.out.println(grapeBox4);
		System.out.println();
		Collections.sort(appleBox4.getList(), new FruitComp());
		Collections.sort(grapeBox4.getList(), new FruitComp());
		System.out.println(appleBox4);
		System.out.println(grapeBox4);
	}
}
class Fruit4	{
	String name;
	int weight;
	
	Fruit4(String name, int weight) {
		this.name   = name;
		this.weight = weight;
	}

	public String toString() { return name+"("+weight+")";}
	
}

class Apple4 extends Fruit4 {
	Apple4(String name, int weight) {
		super(name, weight);
	}
}

class Grape4 extends Fruit4 {
	Grape4(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple4> {
	public int compare(Apple4 t1, Apple4 t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeComp implements Comparator<Grape4> {
	public int compare(Grape4 t1, Grape4 t2) {
		return t2.weight - t1.weight;
	}
}

class FruitComp implements Comparator<Fruit4> {
	public int compare(Fruit4 t1, Fruit4 t2) {
		return t1.weight - t2.weight;
	}
}



class FruitBox4<T extends Fruit4> extends Box4<T> {}

class Box4<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() { return list; }

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}
