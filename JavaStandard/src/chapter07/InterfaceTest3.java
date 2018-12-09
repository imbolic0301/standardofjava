package chapter07;

import chapter07.inventory.I;
import chapter07.inventory.I2;

class InstanceManager {
	public static I2 getInstance() {
		return new B3();
	}
}

class A3 {
	void methodA() {
		I2 i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

class B3 implements I2 {

	@Override
	public void methodB() {
		System.out.println("methodB3 in B3 Class");
		
	}
	public String toString() {return "class B3";}

	
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA();
	}

}
