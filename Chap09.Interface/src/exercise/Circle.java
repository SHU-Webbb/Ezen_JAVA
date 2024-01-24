package exercise;

public class Circle implements Drawable {
	private int x;
	private int y;
	private double radius;
	public String[] color_name = {" ","빨강","초록","파랑","검정","하양"};

	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw(int color) {
		
		System.out.println("(" + x + ")" + ", (" + y + ") 위치에 반지름" + radius + ", "
				+ "원 색깔이 " + color_name[color] + "인 원을 그립니다.\n");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

}
