package exercise;

public class PointCircleTest {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(3,4);
		
		
		
		
		System.out.println(p1); // toString() 테스트 
		p1.setX(8); // setters 테스트
		p1.setY(6); 
		System.out.println("x is: " + p1.getX()); // getters 테스트 
		System.out.println("y is: " + p1.getY()); 
		p1.setXY(3, 0); // setXY() 테스트 
		System.out.println(p1.getXY()[0]); // getXY() 테스트 
		System.out.println(p1.getXY()[1]); 
		System.out.println(p1); 
		
		MyPoint p2 = new MyPoint(0, 4); // 다른 생성자 테스트 
		System.out.println(p2); // 오버로드 메소드 distance() 테스트 System.out.println(p1.distance(p2)); // 어느 메소드? System.out.println(p2.distance(p1)); // 어느 메소드? 
		p1.distance(5, 6); // 어느 메소드? 
		p1.distance(); // 어느 메소드?
		
		//MyPiont[] points = new MyPoint[10];
		
		
	}
	

}
