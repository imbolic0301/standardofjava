package chpater08;

public class ExceptionEx7 {	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4); //윗줄에서 예외 발생->4는 출력 X
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}

}
