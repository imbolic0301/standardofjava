package chapter06;

public class BlockTest {

	static {
		System.out.println("클래스 초기화 블록 실행");
	}
	
	{
		System.out.println("인스턴스 초기화 블록 실행");
	}
		
	public static void main(String[] args) {
		System.out.println("Blocktest bt =new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("Blocktest bt2 =new BlockTest();");
		BlockTest bt2 = new BlockTest();
		
	}

}
