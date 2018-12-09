package chapter07;

public class InnerEx1 {
	class InstanceInner {
		int iv = 100;
		//static int cv = 100; 이너클래스인데 static은 안됨. 아래처럼 상수면 가능.
		final static int CONST = 100;
	}
	
	static class StaticInner{
		int iv= 200;
		static int cv = 200; //static 클래스라서 inner클래스인데도 static 사용 가능!
	}
	
	void myMethod() {
		class LocalInner {
			int iv =300;
			//static int cv = 300;
			final static int CONST = 300;
			
			
		}
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		InnerEx1 ex1 = new InnerEx1();
		
	}

}
