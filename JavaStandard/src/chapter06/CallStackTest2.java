package chapter06;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
		firstMethod();
		System.out.println("메인 메소드 종료");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod 시작");
		secondMehtod();
		System.out.println("firstMethod 종료");
	}
	
	static void secondMehtod(){
		System.out.println("secondMethod 시작");
		System.out.println("secondMethod");
		System.out.println("secondMethod 종료");
	}

}
