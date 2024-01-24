package sec10_composition;

class Shape {
	String color = "black";
	
	void draw() {
		System.out.println(color + "색으로 도형을 그립니다.");
	}
}

class Point {
	int x, y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = y;
		this.y = y;
	}
	
	String getXY() {
		return"("+x+","+y+")";
	}
}

class Circle extends Shape {
	Point center;	// 원의 원점좌표
	int   r;		// 반지름

	public Circle() {
		this(new Point(0,0), 100);
	}
	
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

	@Override
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s]\n",
					center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	@Override
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n",
						p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}
public class DrawShape {

	public static void main(String[] args) {
		
		
		Circle c1 = new Circle();
		c1.draw();
		
//		Point p = new Point(23, 30);
//		Circle c2 = new Circle(p,50);
		Circle c2 = new Circle(new Point(20,30),50);
		
		c2.draw();
		
		/*
		Point[] p = new Point[3];
		p[0] = new Point(100,100);
		p[1] = new Point(50,50);
		p[2] = new Point(40,30);
		*/ //위의 내용을 다른 방식으로 표현
		Point[] p = {
				new Point (100, 100),
				new Point (50,50),
				new Point (40,30)
		};
		
		Triangle t1 = new Triangle(p);
		t1.draw();
		

	}

}
