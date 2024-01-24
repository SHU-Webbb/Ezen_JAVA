package exercise;

public class MyCircle {

	MyPoint center = new MyPoint(0, 0);
	private int radius = 1;

	public MyCircle() {
		this(0, 0, 1);
	}

	public MyCircle(int x, int y, int radius) {

		center = new MyPoint(x, y);
		this.radius = radius;
	}

	public MyCircle(MyPoint center, int radius) {

		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getCenterX() {

		return center.getX();
	}
	public int getCenterY() {

		return center.getY();
	}
	
	public int[] getCenterXY() {

		return center.getXY();
	}
	
	
}
