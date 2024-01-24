package sec11_abstract_class;

/*
 * 음악을 재생하는 기능을 가지는 추상 클래스
 */

public abstract class Player {
	int currentPos; // 현재 재생위치
	boolean pause; // 일시정지 상태

	Player() {
		pause = false;
		currentPos = 0;
	}

	// 현재 상태에서 구체적으로 구현할 수 없음 : 추상 메서드 (abstract method)
	abstract void play(int pos);

	abstract void stop();

	// 추상클래스 내에서 일반 메소드 구현 가능함.
	void play() {
		// 추상 메소드 호출
		play(currentPos);
	}

	// 일시정지 기능 구현
	void pause() {
		if (pause) {// 현재 일시정지 상태임
			pause = false;
			play(currentPos);
		} else { // 현재 play중임
			pause = true;
		}
	}

}
