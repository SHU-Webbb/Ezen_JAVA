package sec10.method_overloading;
/*
 * 여러가지 타입의 데이터를 출력하는 클래스
 * 메소드 오버로딩을 사용하지 않고 구현한 예
 */
class DisplayInfo{
	//문자를 출력하는 메소드
	public void disp(char c) {
		System.out.println(c);
	}
	
	//문자열을 출력하는 메소드
	public void dispString(String str) {
		System.out.println(str);
	}
	
	//숫자를 출력하는 메소드
	public void dispInt(int num) {
		System.out.println(num);
	}
	
}

public class OverLoadTest {

	public static void main(String[] args) {
		DisplayInfo d1 = new DisplayInfo();
		
		d1.disp('A');
		
		//문자열 출력
		//d1.disp("abc");//사용 불가능
		
		d1.dispString("abc");
		
		// 숫자 출력
//		d1.disp(123); 사용 불가능
//		d1.dispString(123); 사용 불가능
		d1.dispInt(123);

	}

}
