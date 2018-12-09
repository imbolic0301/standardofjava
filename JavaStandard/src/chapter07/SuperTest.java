package chapter07;

public class SuperTest {

	public static void main(String[] args) {
		ExChild c = new ExChild();
		c.method();
	}

}


class ExParent {
	int x=10;
}

class ExChild extends ExParent{
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}