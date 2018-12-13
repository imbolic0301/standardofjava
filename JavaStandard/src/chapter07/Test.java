package chapter07;

import java.util.List;

class TestA {
	void method() {
		System.out.println("A.method()");
	}
	
}

class TestB extends TestA{
	 
	@Override
	void method() {
		super.method();
		System.out.println("B.method()");
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		TestA a = new TestA();
		TestA a1 = new TestB();
		a.method();
		a1.method();
		
		TestB b = new TestB();
		System.out.println(b.getClass().getSuperclass().getSuperclass());
		
		
	
	}

}
