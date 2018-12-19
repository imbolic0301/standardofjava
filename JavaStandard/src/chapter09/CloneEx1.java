package chapter09;

import chapter09.inventory.Point;

public class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone();
		System.out.println(original);
		System.out.println(copy);
	}

}
