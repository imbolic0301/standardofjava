package chapter07;

public class InnerEx2 {
	class InstanceInner2 {}
	static class StaticInner {}
	
	InstanceInner2 iv = new InstanceInner2();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static 멤버는 인스턴스 멤버에 직접 접근할 ㅅ ㅜ없다.
		//InstanceInner2 obj1 = new InstanceInner2 ();
		StaticInner obj2 = new StaticInner();
		
		InnerEx2 outer = new InnerEx2();
		InstanceInner2 obj1 = outer.new InstanceInner2();
	}
	
	void instanceMethod() {
		InstanceInner2 obj1 =new InstanceInner2();
		StaticInner obj2 = new StaticInner();
		//LocalInner lv = new LocalInner(); 메서드 내의 지역적으로 선언된 내부 클래스는 외부에서 접근 불가.
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
