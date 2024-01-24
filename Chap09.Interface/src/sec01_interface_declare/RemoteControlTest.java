package sec01_interface_declare;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rc1,rc2;
		
		rc1 = new Tv();
		rc1.turnOn();
		rc1.setVolume(7);
		
		//default 메소드 사용 예
		rc1.setMute(true);
		
		rc2 = new Audio();
		rc2.turnOn();
		rc2.setVolume(6);
		
		
		//static 메서드 사용 예
		RemoteControl.changeBattery();
		

}
}
