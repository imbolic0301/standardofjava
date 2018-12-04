package chapter06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	}
	
	static void firstMethod() {
		secondMehtod();
	}
	
	static void secondMehtod(){
		System.out.println("secondMethod");
	}

}
