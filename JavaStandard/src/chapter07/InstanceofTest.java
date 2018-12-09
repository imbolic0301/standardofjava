package chapter07;

import chapter07.inventory.Car;
import chapter07.inventory.FireEngine;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("this is FireEngine");
		}
		
		if(fe instanceof Car) {
			System.out.println("this is Car instance");
		}
		
		if(fe instanceof Object) {
			System.out.println("this is an Object instance");
		}
		
		System.out.println(fe.getClass().getName());
		
	}

}
