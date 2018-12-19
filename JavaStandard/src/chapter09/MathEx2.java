package chapter09;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx2 {
	public static void main(String args[]) {
		int i = Integer.MIN_VALUE;

		out.println("i =" + i);
		out.println("-i=" + (-i)); //음수로 바꿀 때, 2진법을 사용해 비트들을 2의 보수로 바꾸고 +1을 해준다.
		//그런데 최대값에 +1을 해주니 오버플로우로 최저값으로 변한 것.

		try {
			out.printf("negateExact(%d)= %d%n", 10, negateExact(10));
			out.printf("negateExact(%d)= %d%n", -10, negateExact(-10));

			out.printf("negateExact(%d)= %d%n", i, negateExact(i));
		} catch (ArithmeticException e) {
			out.printf("negateExact(%d)= %d%n", (long) i, negateExact((long) i));
		}
	}
}