package sec03_interface_extends;

//게임 유닛
class Unit {
	int crrentHP; // 유닛의 체력
	int x;
	int y;

}

//캐릭터가 움직이는 기능을 인터페이스로 선언
interface Movable {
	public abstract void move(int x, int y);

}

//캐릭터가 공격하는 기능을 인터페이스로 선언
interface Attackable {
	public abstract void attack(Unit u);
}

//2개의 인터페이스를 상속받는 인터페이스 선언
interface Fightable extends Movable, Attackable {

}

class Tank extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.println("탱크가 무한궤도를 사용해서 "+x+","+ y+"위치로 이동합니다.");
	}

	@Override
	public void attack(Unit u) {
		System.out.println("탱크가 포를 이용해서 유닛을 공격합니다.");
	}

}

public class FighterTest {

	public static void main(String[] args) {
			
		Tank t = new Tank();
		t.move(10,10);
		t.attack(new Unit());
		
		
	}

}
