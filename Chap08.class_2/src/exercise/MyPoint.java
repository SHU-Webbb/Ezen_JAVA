package exercise;

public class MyPoint {
	private int x = 0;
	private int y = 0;

	public MyPoint() {

	}

	public MyPoint(int x,int y) {
		this.x = x;
		this.y = y;

	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] a = {x,y};
		return a;
	}
	
	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+ x + ","+ y+ ")";
	}
	
	public void distance(int x, int y) {
		
		
		double xx = this.x - x;
		double yy = this.y - y;
		
		
		double result;
		
		result = Math.sqrt(xx * xx + yy * yy);
		
		System.out.println("이 점에서 주어진 점 (x,y)까지의 거리 : "+ result);
	}
	
	public void distance() {
		
		double x = 0.0;
		double y = 0.0;
		
		double xx = this.x - x;
		double yy = this.y - y;
		
		
		double result;
		
		result = Math.sqrt(xx * xx + yy * yy);
		
		System.out.println("이 점에서 주어진 점 (x,y)까지의 거리 : "+ result);
	}
	
	
	
	
	
	
	
	
	
	
}
