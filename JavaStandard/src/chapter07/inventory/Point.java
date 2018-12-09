package chapter07.inventory;

public class Point {
	int x, y;
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0,0);
	}
	
	public String getXY() {
		return "("+x+","+y+")";
	}
	
	
	public String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}
