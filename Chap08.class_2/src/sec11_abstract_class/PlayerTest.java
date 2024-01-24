package sec11_abstract_class;

public class PlayerTest {

	public static void main(String[] args) {
		// Player p = new Player(); //추상클래스는 객체로 만들 수 없다.
		CdPlayer player = new CdPlayer();
		Player p3 = new CdPlayer(); // 조상 타입으로 선언 가능함.

		player.play(1);
		player.nextTrack();
		player.pause();
		player.prevTrack();
		player.pause();
		player.prevTrack();
	}

}
