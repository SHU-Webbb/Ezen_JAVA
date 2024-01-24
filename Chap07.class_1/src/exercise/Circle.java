package exercise;

public class Circle {

	private double radius = 1.0;
	private String color = "red";

	
	Circle() {

	}

	Circle(double radius) {
		this.radius = radius;
	}

	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getradius() {
		return radius;
	}

	public double getArea() {

		// return radius * radius * 3.14;
		return Math.PI * Math.pow(radius, 2);
	}

	public void getArea2() {
		double area;
		area = radius * radius * 3.14;
		System.out.println(area);
	}

	
	
	public String getColor(){
		return color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	void setColor (String color) {
		if(color != "red") {
			this.color = "red";
		}else {
			this.color = color;
		}
	}
	
	void setRadius(double radius) {
		if(radius != 1.0) {
			this.radius = 1.0;
		}else {
			this.radius = radius;
		}
	}
}
