package sec01_interface_declare;

public class Audio implements RemoteControl {

	// 멤버 변수
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원을 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume >= RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume <= RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재의 오디오 볼륨은 " + volume + "입니다.");
	}

}
