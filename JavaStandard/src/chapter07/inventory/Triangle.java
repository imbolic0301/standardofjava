package chapter07.inventory;

public class Triangle extends Shape{
	private Point[] p = new Point[3];
	
	public Triangle(Point[] p) {
		this.p = p;
	}
	
	public void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
				p[0].getXY(), p[1].getXY(), p[2].getXY(),color);
	}
}
