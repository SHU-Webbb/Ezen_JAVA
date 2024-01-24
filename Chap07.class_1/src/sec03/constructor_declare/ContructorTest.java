package sec03.constructor_declare;

class Data1 {
	int value;
    // 생성자 없음 - 컴파일러가 자동 생성
}

class Data2 {
	int value;
	//생성자 있음
	//기본 생성자가 자동으로 생성되지 않음
	Data2(int x) {
		value = x;
	}
	Data2() { }
}

public class ContructorTest {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		//Data2 d2 = new Date2(); // 기본 생성자 사용 불가능
		Data2 d3 = new Data2(3); 
		// 또는 기본 생성자를 만들어 주어야 함.
		Data2 d4 = new Data2(); // 기본 생성자를 만든 후 사용가능
	}

}
