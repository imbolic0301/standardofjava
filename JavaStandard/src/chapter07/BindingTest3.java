package chapter07;

import chapter07.inventory.Child3;
import chapter07.inventory.Parent;

public class BindingTest3 {

	public static void main(String[] args) {

		Parent p = new Child3();
		Child3 c = new Child3();

		System.out.println("p. x =" + p.x);
		p.method();
		System.out.println();
		System.out.println("c. x = " + c.x);
		c.method();

	}

}
