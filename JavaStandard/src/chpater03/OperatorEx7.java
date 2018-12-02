package chpater03;

public class OperatorEx7 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte) (a*b);
		System.out.println(c);
		//300은  byte의 표현범위를 넘어서기에 오버플로우가 발생해 44라는 결과가 나온다.
	}

}
