package chapter07;

import chapter07.inventory.MyInterface;
import chapter07.inventory.MyInterface2;

public class DefaultMethodTest {

	public static void main(String[] args) {
		MyChild c = new MyChild();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}

}

class MyChild extends MyParent 
	implements MyInterface,MyInterface2 {
	
	public void method1() {
		System.out.println("method1() in Child");
	}
}

class MyParent {
	public void method2 () {
		System.out.println("method2 in MyParent Class");
	}
}
