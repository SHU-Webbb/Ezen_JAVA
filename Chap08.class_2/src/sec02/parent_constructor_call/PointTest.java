package sec02.parent_constructor_call;

//2차원 좌표를 표현하는 클래스
class Point {
	int x;
	int y;

	// 생성자
	Point() { }

	Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	// 좌표 읽기
	String getLocation() {
		return "x: " + x + ", y :" + y;
	}
	
}

//3차원 좌표를 표현하는 클래스
class Point3D extends Point {
	int z;
	
	//생성자
	Point3D (int x, int y, int z){
		super(); //컴파일러에서 부모생성자 호출이 자동으로 추가함 ,
					// 부모 클래스에 Point()라는 생성자가 있어야 함.
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

public class PointTest {

	public static void main(String[] args) {

	}

}
