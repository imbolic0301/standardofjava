package chapter14;

@FunctionalInterface
interface MyFunction1 {
	void run();
}

public class LambdaEx1 {
	static void execution(MyFunction1 f) { //매개변수의 타입이 MyFunction인 메서드
		f.run(); 
	}
	
	static MyFunction1 getMyFunction() {
		MyFunction1 f = () -> System.out.println("f3.run()");
		return f;
		
	}
	
	static void execute(MyFunction1 f) { f.run(); }
	
	public static void main(String[] args) {
		MyFunction1 f1 = () -> System.out.println("f1.run()");
		
		MyFunction1 f2 = new MyFunction1() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		MyFunction1 f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()"));
		execute(f2);
	}
}
