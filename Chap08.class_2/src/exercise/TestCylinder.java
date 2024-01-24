package exercise;

public class TestCylinder {

	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder();
		
		System.out.println(c1.getRadius());
		System.out.println(c1.getHeight());
		System.out.println(c1.getVolume());
		
		System.out.println();
		
		Cylinder c2 = new Cylinder(10.0);
		
		
		System.out.println(c2.getRadius());
		System.out.println(c2.getHeight());
		System.out.println(c2.getVolume());
		
		System.out.println();
		
		Cylinder c3 = new Cylinder(2.0,10.0);
		
				
		System.out.println(c3.getRadius());
		System.out.println(c3.getHeight());
		System.out.println(c3.getVolume());
		
		
		
		

	}

}
