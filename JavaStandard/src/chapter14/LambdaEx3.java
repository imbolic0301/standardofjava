package chapter14;

class Outer {
	int val = 10;
	
	class Inner {
		int val = 20;
		
		void method(int i) {
			int val=30;
			//i= 10; 함수형 인터페이스에서 참조하려면 반드시 상수가 되어야만 하기에 오류
			
			MyFunction2 f = () -> {
				System.out.println("i :" + i);
				System.out.println("val :" + val);
				System.out.println("this.val :" + ++this.val);
				System.out.println("Outer.this.val :" + ++Outer.this.val);
				
			};
			
			f.myMethod();
		}
		
		
	}
}
public class LambdaEx3 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
		
	}
	
}
