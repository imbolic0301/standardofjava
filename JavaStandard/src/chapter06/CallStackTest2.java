package chapter06;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("���� �޼ҵ� ����");
		firstMethod();
		System.out.println("���� �޼ҵ� ����");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod ����");
		secondMehtod();
		System.out.println("firstMethod ����");
	}
	
	static void secondMehtod(){
		System.out.println("secondMethod ����");
		System.out.println("secondMethod");
		System.out.println("secondMethod ����");
	}

}
