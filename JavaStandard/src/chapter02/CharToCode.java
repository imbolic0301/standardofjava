package chapter02;

public class CharToCode {
	public static void main(String[] args) {
		char ch = 'A'; //16진수로 0x41
		int code = (int) ch;
		System.out.printf("%c=%d(%#X)%n",ch,code,code);
		
		char hch = '가'; //16진수로 0xAC00
		System.out.printf("%c=%d(%#X)%n",hch,(int)hch,(int)hch);
		
	}
}
