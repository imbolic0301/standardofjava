package chapter06;

public class BlockTest {

	static {
		System.out.println("Ŭ���� �ʱ�ȭ ��� ����");
	}
	
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��� ����");
	}
		
	public static void main(String[] args) {
		System.out.println("Blocktest bt =new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("Blocktest bt2 =new BlockTest();");
		BlockTest bt2 = new BlockTest();
		
	}

}
