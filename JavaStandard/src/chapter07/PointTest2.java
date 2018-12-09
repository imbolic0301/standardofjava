package chapter07;

public class PointTest2 {

	public static void main(String[] args) {
		SecondPoint3D p3 = new SecondPoint3D();
		System.out.println("p3.x =" + p3.x);
		System.out.println("p3.y =" + p3.y);
		System.out.println("p3.z =" + p3.z);
	}

}

class Point2 {
	int x= 10;
	int y = 20;
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class SecondPoint3D extends Point2{
	int z = 30;
	
	SecondPoint3D(){
		this(100, 200, 300);
	}
	
	public SecondPoint3D(int x, int y, int z) {
		super(x,y);
		this.z= z;
	}
}