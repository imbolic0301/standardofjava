package chapter07;

public class InnerEx2 {
	class InstanceInner2 {}
	static class StaticInner {}
	
	InstanceInner2 iv = new InstanceInner2();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static ����� �ν��Ͻ� ����� ���� ������ �� �̾���.
		//InstanceInner2 obj1 = new InstanceInner2 ();
		StaticInner obj2 = new StaticInner();
		
		InnerEx2 outer = new InnerEx2();
		InstanceInner2 obj1 = outer.new InstanceInner2();
	}
	
	void instanceMethod() {
		InstanceInner2 obj1 =new InstanceInner2();
		StaticInner obj2 = new StaticInner();
		//LocalInner lv = new LocalInner(); �޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ���� �Ұ�.
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
