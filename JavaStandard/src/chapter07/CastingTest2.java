package chapter07;

import chapter07.inventory.Car;
import chapter07.inventory.FireEngine;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine) car; // �������� �����ϳ� ����� ����.
		//�θ� Ÿ���� ������ �ڼ� Ÿ���� ������ ���� ����ȯ���� �Ͼ ����. ClassCastingException�� �Ͼ!!
		fe.drive();
		car2 = fe;
		car2.drive();

	}

}
