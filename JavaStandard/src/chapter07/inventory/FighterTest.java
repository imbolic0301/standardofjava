package chapter07.inventory;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if( f instanceof Unit) {
			System.out.println("f�� UnitŬ������ �ڼ�");
		}
		
		if( f instanceof FFightable) {
			System.out.println("f�� FFightable �������̽��� ����");
		}
		
		if( f instanceof FMovable) {
			System.out.println("f�� Movable �������̽� ����");
		}
		
		if( f instanceof FAttackable) {
			System.out.println("f�� Attackable�������̽� ����");
		}
		
		if( f instanceof Object) {
			System.out.println("f�� Object Ŭ������ �ڼ�");
		}
		
		
	}

}


class Fighter extends Unit implements FFightable {
	public void move(int x, int y) {};
	public void attack(Unit u) {};
}


class Unit {
	int currentHP;
	int x;
	int y;
}
interface FFightable extends FMovable, FAttackable { }
interface FMovable { void move(int x, int y) ;}
interface FAttackable { void attack(Unit u) ;}