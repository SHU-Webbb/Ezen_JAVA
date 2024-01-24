package sec10.method_overloading;
/*
 * 여러가지 타입의 데이터를 출력하는 클래스
 * 메소드 오버로딩을 사용한 예
 */
class DisplayInfo2{
	//문자를 출력하는 메소드
	public void disp(char c) {
		System.out.println(c);
	}
	
	//문자열을 출력하는 메소드
	public void disp(String str) {
		System.out.println(str);
	}
	
	//숫자를 출력하는 메소드
	public void disp(int num) {
		System.out.println(num);
	}
	
}

public class OverLoadTest2 {

	public static void main(String[] args) {
		DisplayInfo2 d1 = new DisplayInfo2();
		
		d1.disp('A');
		//문자열 출력				
		d1.disp("abc");
		//숫자 출력		
		d1.disp(123);

	}

}
