package chapter07;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceIneer {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	static class StaticInner {
		//int siv = outerIv; 스태틱 클래스->인스턴스멤버에 접근 불가
		static int scv = outerCv;
	}
	
	
	void myMethod() {
		int lv = 0;
		final int LV =0;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}
}
