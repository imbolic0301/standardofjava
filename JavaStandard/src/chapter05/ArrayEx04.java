package chapter05;

public class ArrayEx04 {

	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D' };
		char[] num = { '0', '1', '2', '3','4','5','6','7','8','9' };
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 붙여 하나로 만든다.
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length , num.length);
		System.out.println(result);
		
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		

		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
