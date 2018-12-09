package chapter07;

import chapter07.inventory.I;

class A2 {
	void autoplay(I i) {
		i.play();
	}
}

class B2 implements I {

	@Override
	public void play() {
		System.out.println("play in B Class");
		
	}
}

class C implements I {

	@Override
	public void play() {
		System.out.println("play in C Class");
		
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.autoplay(new B2());
		a.autoplay(new C());
		
	}

}
