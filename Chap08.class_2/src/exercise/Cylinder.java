package exercise;

public class Cylinder extends Circle {
	
	private double height = 1.0;
	
	
	public Cylinder() {
		
	}
	public Cylinder(double height) {
		this.height = height;
	}
	public Cylinder(double radius, double height) {
		
		//첫번째 방법
		super(radius);
		//두번째 방법
		//setRadius(radius);
		this.height = height;
	}
		
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		
		return height*getArea();
	}
}
