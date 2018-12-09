package chapter07.inventory;

public class Point3D extends Point{
	private int z;
	
	public Point3D(int x, int y, int z) {
		
		this.x= x;
		this.y = y;
		this. z = z;
	}
	
	public String getLocation() {

		return "x : " + x + ", y : " + y + ", z: "+ z;
	}
	
	
	
}

