package chapter02;

public class SpecialCharEx {
	public static void main(String[] args) {
		System.out.println('\''); // '''처럼 할 수 없음.
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워짐.\
		System.out.println("abc\f6"); // \b에 의해 3이 지워짐.
		System.out.println('\n');
		System.out.println("\"Hello\"");
		System.out.println("C:\\");
	
	
	}
}
