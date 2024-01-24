package sec01;

public class IncDec {

	public static void main(String[] args) {
		int a = 5;

		System.out.println("a = " + (++a));

		a = 5;
		System.out.println("a = " + (a++));
		System.out.println("a = " + a);

		int x = 100;
		int y = 200;
		// ++x + y; = 301
		// x++ + y; = 300
		int result = x++ + y;
		System.out.println("result = " + result);
		System.out.printf("x=%d, y=%d\n" , x,y);

		x = 10;
		y = 10;
		// ++x + y++

		result = ++x + y++;
		System.out.println("result = " + result);

	}

}
