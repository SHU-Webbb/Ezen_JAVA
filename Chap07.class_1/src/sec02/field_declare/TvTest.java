package sec02.field_declare;

public class TvTest {

	public static void main(String[] args) {
		
		Tv myTv = new Tv();
		
		myTv.color = "화이트";
		myTv.power = true;
		myTv.channel = 11;
		
		System.out.println("전원상태 : " + myTv.power);
		System.out.println("채널 값 : " + myTv.channel);
		System.out.println("색상 : " + myTv.color);
	}

}
