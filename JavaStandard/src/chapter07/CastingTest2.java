package chapter07;

import chapter07.inventory.Car;
import chapter07.inventory.FireEngine;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine) car; // 컴파일은 성공하나 실행시 에러.
		//부모 타입의 변수를 자손 타입의 변수로 강제 형변환하자 일어난 에러. ClassCastingException이 일어남!!
		fe.drive();
		car2 = fe;
		car2.drive();

	}

}
