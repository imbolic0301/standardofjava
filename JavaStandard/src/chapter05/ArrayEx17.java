package chapter05;

public class ArrayEx17 {

	public static void main(String[] args) {	
		
		
		if(args.length !=3) {
			System.out.println("매개변수의 개수 : "+ args.length);
			System.out.println("usage : java ArrayEx17 Num1 OP NUM2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);
		
		char op = args[1].charAt(0);

		int num2 = Integer.parseInt(args[2]);
		
		int result =0;
		
		switch(op) {
			case '+' :
				result = num1 + num2 ;
				break;
			case '-' :
				result = num1 - num2 ;
				break;
			case 'x' :
				result = num1 * num2 ;
				break;
			case '/' :
				result = num1 / num2 ;
				break;
			default : System.out.println("연산자가 올바르지 않습니다.");
		}
		
		System.out.println("결과 : " + result);

	}

}
