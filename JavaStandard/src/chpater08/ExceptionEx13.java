package chpater08;

public class ExceptionEx13 {

	public static void main(String[] args) throws Exception {
		method1();
		
	}
	
	static void method1() {
		try {
			throw new Exception() ;
		}catch(Exception e) {
			System.out.println("method1에서 예외처리 실행");
			e.printStackTrace();
		}
	}
}
