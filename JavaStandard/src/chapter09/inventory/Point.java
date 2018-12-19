package chapter09.inventory;

public class Point implements Cloneable{
	public int x;
	public int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x=" + x + ", y=" + y;
	}
	
	public Object clone(){
		Object obj = null;
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException e){}
		return obj;
	}
}
