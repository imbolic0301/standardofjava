package chpater08;

public class ExceptionEx14 {

	public static void main(String[] args) throws Exception {
		try {
			method1();
		}catch (Exception e) {
			System.out.println("���� �޼ҵ忡�� ����ó��");
			e.printStackTrace();
		}
		
	}
	
	static void method1() throws Exception {
		throw new Exception();
	}

}
