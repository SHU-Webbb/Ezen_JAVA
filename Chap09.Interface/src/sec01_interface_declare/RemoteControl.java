package sec01_interface_declare;

public interface RemoteControl {
	
	//상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0; //public static final 생략 형태
	
	//추상 메서드
	public abstract void turnOn();//전원을 켜는 기능
	public abstract void turnOff(); 			  //전원을 끄는 기능
	public abstract void setVolume(int volume);   //음량을 설정하는 기능
	
	
	//디폴트 메서드
	// 이 인터페이스를 구현한 다른 클래스에 수정하지 않고 기능 추가를 할 수 있다.
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리를 합니다.");
		} else {
			System.out.println("무음을 해지합니다.");
		}

	}
	
	// static 메서드
	static void changeBattery() {
		System.out.println("리모컨의 건전지를 교환합니다.");
	}
}
