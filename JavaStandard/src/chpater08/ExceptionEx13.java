package chpater08;

public class ExceptionEx13 {

	public static void main(String[] args) throws Exception {
		method1();
		
	}
	
	static void method1() {
		try {
			throw new Exception() ;
		}catch(Exception e) {
			System.out.println("method1���� ����ó�� ����");
			e.printStackTrace();
		}
	}
}
