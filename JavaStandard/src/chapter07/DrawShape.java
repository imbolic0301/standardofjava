package chapter07;

import chapter07.inventory.Circle;
import chapter07.inventory.Point;
import chapter07.inventory.Triangle;

public class DrawShape {

	public static void main(String[] args) {
		Point[] p = { new Point(100,100), new Point(140 ,50) , new Point(200, 100)};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150),50);
		
		t.draw();
		c.draw();
		
	}

}
