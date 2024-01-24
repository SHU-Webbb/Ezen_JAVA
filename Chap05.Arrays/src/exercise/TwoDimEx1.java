package exercise;

public class TwoDimEx1 {

	public static void main(String[] args) {
		double[][] rain = { 
				   {256.5, 654.2, 456.3, 76.9},
				   {204.1, 610.4, 108.8, 66.6},
				   {231.3, 752, 143.1, 142.3},
				   {302.9, 692.6, 307.6, 98.7},
				   {256.9, 1053.60, 225.5, 45.6},
				   {256.5, 770.6, 363.3, 139.3},
				   {264.3, 567.5, 231.2, 59.7},
				   {215.9, 599.8, 293.1, 76.7},
				   {109.1, 388, 247.3, 223.1}
		
		};
		double sum = 0;
		
		System.out.println("       봄     여름     가을    겨울    년간합계");
		System.out.println("-----------------------------------------");

		for (int i = 0; i < rain.length; i++) {
				sum = 0.0;
			System.out.printf("%d년 ", 2015+i);
				for (int k = 0; k < rain[i].length; k++) {
									
					sum = sum + rain[i][k];
					
				System.out.printf("%3.2f ",rain[i][k]);
				
			}
			System.out.printf("%3.2f",sum);
			System.out.println();
		}
		

	}

}
