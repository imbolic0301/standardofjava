package chapter07.inventory;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if( f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손");
		}
		
		if( f instanceof FFightable) {
			System.out.println("f는 FFightable 인터페이스를 구현");
		}
		
		if( f instanceof FMovable) {
			System.out.println("f는 Movable 인터페이스 구현");
		}
		
		if( f instanceof FAttackable) {
			System.out.println("f는 Attackable인터페이스 구현");
		}
		
		if( f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손");
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