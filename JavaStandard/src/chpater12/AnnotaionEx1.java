package chpater12;

class Parent1 {
	void parentMethod() { }
}

class Child1 extends Parent1 {
	//@Override
	void parentmethod() { } // 조상 메서드의 이름을 잘못적었음. 
}
//컴파일 에러는 빨간줄에 갖다대면 나온당!
