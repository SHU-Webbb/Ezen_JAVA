package sec02.parent_constructor_call2;

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
		return "x : " + x + ", y : " + y;
	}
	
}

//3차원 좌표를 표현하는 클래스
class Point3D extends Point {
	int z;
	
	//생성자
	Point3D (int x, int y, int z){
		//super(); //컴파일러에서 부모생성자 호출이 자동으로 추가함 ,
					// (1) 첫번째 방법 : 부모 클래스에 Point()라는 생성자추가
					// (2) 두번째 방법 : 부모 클래스에 이미 존재하는 Point(x,y)생성자를 사용.
		super(x,y);
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	String getLocation() {
		return "x : " + x + ", y : " + y +", z : "+ z;
	}
}

public class PointTest {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(1,6,10);
		
		
		System.out.println(p1.getLocation());
	}
	
	
}
