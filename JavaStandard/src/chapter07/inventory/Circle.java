package chapter07.inventory;

public class Circle extends Shape{
	private Point center;
	private int r;
	
	public Circle() {
		this(new Point(0,0), 100);
	}

	public Circle(Point point, int i) {
		this.center = point;
		this.r = i;
	}
	
	public void draw() {
		System.out.printf("[center=(%d, %d,r=%d, color=%s]%n",
							center.x, center.y, r, color);
	}
	
}
