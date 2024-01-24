package sec11_abstract_class;

public class CdPlayer extends Player {

	@Override
	void play(int pos) {
		currentPos = pos;
		System.out.println("CD플레이어가 " + pos + "번 트랙을 재생합니다.");

	}

	@Override
	void stop() {
		System.out.println("CD플레이어가 재생을 중지합니다.");
	}

	void nextTrack() {
		if (!pause) {
			currentPos++;
			System.out.println("CD플레이어가 " + currentPos + "번 트랙을 재생합니다.");
		} else {
			System.out.println("CD플레이어가 재생중이 아닙니다.");
		}
	}

	void prevTrack() {
		if (!pause && currentPos > 1) {
			currentPos--;
			System.out.println("CD플레이어가 " + currentPos + "번 트랙을 재생합니다.");
		} else {
			System.out.println("CD플레이어가 재생중이 아닙니다.");
		}
	}
}
