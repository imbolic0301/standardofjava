package chapter13;

import java.util.ArrayList;

public class ThreadWaitEx1 {
	public static void main(String[] args) throws Exception {
		Table1 table1 = new Table1(); // ���� �����尡 �����ϴ� ��ü

		new Thread(new Cook1(table1), "Cook1").start();
		new Thread(new Customer1(table1, "donut"), "CUST1").start();
		new Thread(new Customer1(table1, "burger"), "CUST2").start();

		// 0.1��(100 �и� ������) �Ŀ� ���� �����Ų��.
		Thread.sleep(100);
		System.exit(0);
	}
}

class Customer1 implements Runnable {
	private Table1 table1;
	private String food;

	Customer1(Table1 Table1, String food) {
		this.table1 = Table1;
		this.food = food;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			String name = Thread.currentThread().getName();

			if (eatFood())
				System.out.println(name + " ate a " + food);
			else
				System.out.println(name + " failed to eat. :(");
		}
	}

	boolean eatFood() {
		return table1.remove(food);
	}
}

class Cook1 implements Runnable {
	private Table1 Table1;

	Cook1(Table1 Table1) {
		this.Table1 = Table1;
	}

	public void run() {
		while (true) {
			// ������ �丮�� �ϳ� �����ؼ� Table�� �߰�
			int idx = (int) (Math.random() * Table1.dishNum());
			Table1.add(Table1.dishNames[idx]);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		} 
	}
}

class Table1 {
	String[] dishNames = { "donut", "donut", "burger" }; // donut�� �� ���� ���´�.
	final int MAX_FOOD = 6; // ���̺� ���� �� �ִ� �ִ� ������ ����

	private ArrayList<String> dishes = new ArrayList<>();

	public void add(String dish) {
		// ���̺� ������ ����á����, ���̺� ������ �߰����� �ʴ´�.
		if (dishes.size() >= MAX_FOOD)
			return;
		dishes.add(dish);
		System.out.println("Dishes:" + dishes.toString());
	}

	public boolean remove(String dishName) {
		// ������ �丮�� ��ġ�ϴ� �丮�� ���̺��� �����Ѵ�.
		for (int i = 0; i < dishes.size(); i++)
			if (dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}

		return false;
	}

	public int dishNum() {
		return dishNames.length;
	}
}