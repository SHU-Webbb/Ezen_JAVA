package exercise;

public class DrawableTest {

	public static void main(String[] args) {

		Drawable[] drawables = new Drawable[] { 
				new Circle(10, 20, 15), 
				new Circle(30, 20, 10),
				new Rectangle(5, 8, 8, 9) 
				};

		for (Drawable d : drawables) {
			d.draw(Drawable.RED);
		}

		//System.out.println(((Circle)drawables[1]).getX());
		
		
	}

}
