package exersize;

public class BreakEx1 {

	public static void main(String[] args) {
		int random = 0;

		do {
			random = (int) (Math.random() * 6) + 1;
			System.out.print(random);
			if (random == 6) {
				break;
			}

		} while (true);
	}

}
