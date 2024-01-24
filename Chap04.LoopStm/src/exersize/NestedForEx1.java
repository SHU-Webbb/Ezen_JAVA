package exersize;

/*
 * 
 *1,1 1,2 1,3
 *2,1 2,2 2,3
 *3,1 3,2 3,3
 */

public class NestedForEx1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("[" + i + "," + j + "]");
				// System.out.printf("[d%,d%]",i,j];
				if (j == 3) {
					System.out.println();
				}
				//System.out.prontln();
			}
		}

	}

}
