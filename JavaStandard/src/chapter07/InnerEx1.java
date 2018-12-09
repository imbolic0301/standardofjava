package chapter07;

public class InnerEx1 {
	class InstanceInner {
		int iv = 100;
		//static int cv = 100; �̳�Ŭ�����ε� static�� �ȵ�. �Ʒ�ó�� ����� ����.
		final static int CONST = 100;
	}
	
	static class StaticInner{
		int iv= 200;
		static int cv = 200; //static Ŭ������ innerŬ�����ε��� static ��� ����!
	}
	
	void myMethod() {
		class LocalInner {
			int iv =300;
			//static int cv = 300;
			final static int CONST = 300;
			
			
		}
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		InnerEx1 ex1 = new InnerEx1();
		
	}

}
