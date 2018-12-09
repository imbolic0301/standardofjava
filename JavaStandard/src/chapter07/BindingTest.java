package chapter07;

import chapter07.inventory.Child;
import chapter07.inventory.Parent;

public class BindingTest {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p. x =" + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}

}
