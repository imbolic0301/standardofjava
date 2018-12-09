package chapter07.inventory;

public class Child3 extends Parent {

	public int x = 200;

	@Override
	public void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
	
	

}
