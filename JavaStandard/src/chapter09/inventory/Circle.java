package chapter09.inventory;

public class Circle implements Cloneable{
	public Point p;
	public double r;

	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}

		return (Circle) obj;
	}

	public Circle deepCopy() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}

		Circle c = (Circle) obj;
		c.p = new Point(this.p.x, this.p.y);
		return c;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
	

}
