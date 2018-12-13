package chpater08;

public class Exception17 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메소드에서 예외처리");
		}
		
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 메소드에서 에외처리");
			throw e;
		}
	}

}
