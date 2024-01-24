package exersize;

public class NestedWhileEx1 {

	public static void main(String[] args) {

		int x = 1;
		int sum = 0;
		int y = 0;

		while (x <= 10) {

			y = 1;
			while (y <= 10) {
				sum = 4 * x + 5 * y;
				if (sum == 60) {
					System.out.println("x = " + x + ", " + "y = " + y);
				}
				y++;
			}
			x++;
		}

	}

}
