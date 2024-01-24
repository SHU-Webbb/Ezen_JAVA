package sec10.method_overloading;

import javax.naming.spi.DirStateFactory.Result;

class Rectangle {
	
	//정사각형의 넓이
	double getArea(double width) {
		return width * width;
	}
	//직사각형의 넓이
	double getArea(double width, double length) {
		return width * length;
	}
	
	public void recArea(double A, double B) {
		double result =  A * B;
		System.out.println(result);
		
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		//정사각형의 넓이 구하기
		double result1 = r1.getArea(5.0);
		System.out.println(result1);
		
		//직사각형의 넓이 구하기
		double result2 = r1.getArea(5.0,6.0);
		System.out.println(result2);
		
		System.out.println(r1);
		
		r1.recArea(10,10);
		

	}

}
