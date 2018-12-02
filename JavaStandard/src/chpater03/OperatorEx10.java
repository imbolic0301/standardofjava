package chpater03;

public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
		
		//먼저 곱할 경우 int의 연산범위를 넘어가나, 먼저 나눌 경우 넘어가지 않았기 때문이다!
	}

}
