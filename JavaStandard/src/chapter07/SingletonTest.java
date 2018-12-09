package chapter07;

import chapter07.inventory.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		
	}

}
